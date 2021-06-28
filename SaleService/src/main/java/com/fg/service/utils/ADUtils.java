package com.fg.service.utils;

import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fg.service.Enum.EnumRESCode;
import com.fg.service.vo.Result;

@Component
public class ADUtils extends BaseUtils {
  
  final String INITIAL_CONTEXT_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";  // INITIAL_CONTEXT_FACTORY=com.sun.jndi.ldap.LdapCtxFactory
  final String PROVIDER_URL = "LDAP://172.16.8.102:389";                      // PROVIDER_URL=LDAP://172.16.8.132:389
  final String SECURITY_AUTHENTICATION = "simple";                            // SECURITY_AUTHENTICATION=simple
  final String SECURITY_PRINCIPAL = "cs";                                     // SECURITY_PRINCIPAL=cs
  
  //true 測試環境， false 正式環境
  @Value("${authTest}")
  boolean authTest;

  /**
   * 驗證AD 採用LDAP驗證
   * 
   * @param acct 使用者登入帳號
   * @param pwd  使用者登入密碼
   * 
   * 查詢內容:
   * givenName = 姓名
   * mail = EMAIL
   * 
   * @return Result 返回物件
   */
  public Result getADUser(String acct, String pwd) {
    //LDAP 設定值
    Hashtable<String, String> env = new Hashtable<String, String>();
    env.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
    env.put(Context.PROVIDER_URL, PROVIDER_URL);
    env.put(Context.SECURITY_AUTHENTICATION, SECURITY_AUTHENTICATION);
    env.put(Context.SECURITY_PRINCIPAL, SECURITY_PRINCIPAL + "\\" + acct.toLowerCase());  // acct=使用者登入帳號
    env.put(Context.SECURITY_CREDENTIALS, pwd);                                           // pwd = 使用者登入密碼
    
    Hashtable<String, String> adUser = new Hashtable<String, String>();                   //返回user資訊
    Result rs = new Result();                                                             //返回物件
    EnumRESCode enumRES = EnumRESCode.SUCCESS;
    rs.setData(adUser);
    
    logger.info("authTest: " + authTest);

    LdapContext ctx = null;
    try {
      if (!authTest) {
        //正式環境
        ctx = new InitialLdapContext(env, null);
        int totalResults = 0;
        javax.naming.directory.SearchControls searchCtls = new javax.naming.directory.SearchControls();
        searchCtls.setSearchScope(javax.naming.directory.SearchControls.SUBTREE_SCOPE);
        String[] attrIDs = { "givenName", "mail" };
        searchCtls.setReturningAttributes(attrIDs);
  
        javax.naming.NamingEnumeration answer = ctx.search("DC=fglife,DC=local", "sAMAccountName=" + acct, searchCtls);
        while (answer.hasMoreElements()) {
          javax.naming.directory.SearchResult sr = (javax.naming.directory.SearchResult) answer.next();
          javax.naming.directory.Attributes Attrs = sr.getAttributes();
          if (Attrs != null) {
            for (javax.naming.NamingEnumeration ne = Attrs.getAll(); ne.hasMore();) {
              javax.naming.directory.Attribute Attr = (javax.naming.directory.Attribute) ne.next();
              for (int i = 0; i < attrIDs.length; i++) {
                if (Attr.getID().equalsIgnoreCase(attrIDs[i])) {
                  for (javax.naming.NamingEnumeration e = Attr.getAll(); e.hasMore(); totalResults++) {
                    adUser.put(attrIDs[i], e.next().toString());
                    break;
                  }
                }
              }
            }
          }
        }
      }else {
        //測試環境
        adUser.put("givenName", "李凱爾");
        adUser.put("mail", "Kyle.lee@fglife.com");
        enumRES = EnumRESCode.SUCCESS;
      }      
    }
    catch (AuthenticationException ae) {
      // 帳號或密碼錯誤
      enumRES = EnumRESCode.ACCPSWFAIL;
    } 
    catch (CommunicationException ce) {
      // 與AD 連線失敗
      enumRES = EnumRESCode.ERROR_CONNECTION;
    }
    catch (Exception ex) {
      //未知錯誤
      enumRES = EnumRESCode.ERROR;
    } 
    finally {
      if (ctx != null)
        try {
          ctx.close();
        } catch (Exception ex) {
          logger.info("關閉元件發生錯誤");
          enumRES = EnumRESCode.ERROR_CLOSE;
        }
    }
    
    rs.setResEnum(enumRES);
    return rs;
  }

}// class End
