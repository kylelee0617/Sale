package com.fg.service.login;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fg.service.BaseService;
import com.fg.service.Enum.EnumRESCode;
import com.fg.service.encrypt.AES;
import com.fg.service.utils.ADUtils;
import com.fg.service.vo.Result;

@Service
public class LoginService extends BaseService {
  
  @Autowired
  ADUtils adUtil;

  public Result chkCookieLogin(String strCookies) {
    Result rs = new Result();
    EnumRESCode valid = null;
    boolean go_on = true; //關卡控制

    // 解密token
    String[] dyToken = AES.AESDncode(RULEKEY, strCookies).split("&&");
    String time = dyToken[0];
    String useracc = dyToken[1];
    String userpwd = dyToken[2];

    // 驗證時間有效
    if (go_on) {
      valid = this.validTime(Long.parseLong(time));
      if (valid.getCode() != EnumRESCode.SUCCESS.getCode()) {
        go_on = false;
      }
    }

    // 帳密檢核
    if(go_on) {
      valid = this.validUser(useracc, userpwd);
    }
    
    rs.setResEnum(valid);
    return rs;
  }

  public EnumRESCode validUser(String useracc, String userpsw) {
    // 輸入空白
    if (StringUtils.pathEquals(useracc, "") || StringUtils.pathEquals(userpsw, "")) {
      return EnumRESCode.LOGINFAIL;
    }

    // 資料庫檢核
    Result userRs = this.chkLogin(useracc, userpsw);
    return userRs.getResEnum();
  }

  /**
   * 跟AD驗證帳號密碼
   * 
   * @param acc
   * @param pwd
   * @return
   */
  private Result chkLogin(String acc, String pwd) {
    Result rs = null;
    try {
      rs = adUtil.getADUser(acc, pwd);
    } catch (Exception ex) {
      rs.setResEnum(EnumRESCode.ERROR);
    }

    return rs;
  }

  /**
   * 驗證token是否過期
   * 
   * @param time
   * @return
   */
  public EnumRESCode validTime(Long tokenTime) {
    long crrTime = System.currentTimeMillis();

    // 取得原戳記TOKENDAY天後的時間戳記
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTimeInMillis(tokenTime);
    calendar1.add(Calendar.DATE, TOKENDAY);
    long validTime = calendar1.getTimeInMillis();

    // 現在戳記 > 原+30天 = 超過
    if (crrTime > validTime) {
      return EnumRESCode.TOKENOUTOFTIME;
    }

    return EnumRESCode.SUCCESS;
  }
  
  public int getTokenDay() {
    return TOKENDAY;
  }

}