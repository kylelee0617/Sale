package com.fg.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fg.service.Enum.EnumRESCode;
import com.fg.service.encrypt.AES;
import com.fg.service.login.LoginService;
import com.fg.web.utils.CookiesUtil;
import com.fg.web.zbean.LoginBean;

@Controller
public class Login extends BaseController {

  @Autowired
  LoginService loginServ;

  LoginBean loginBean;

  @RequestMapping("/login")
  public String login(Model model, @ModelAttribute(value = "loginBean") LoginBean loginBean, RedirectAttributes redParam) {
    if (loginBean == null) {
      loginBean = new LoginBean();
    }
    redParam.addFlashAttribute(loginBean);
    return "page/login";
  }

  @RequestMapping("/doLogin")
  public String doLogin(HttpServletResponse res, @ModelAttribute(value = "loginBean") LoginBean loginBean) {
    String useracc = loginBean.getUseracc();
    String userpwd = loginBean.getUserpwd();

    // 帳密檢核
    EnumRESCode validAccPsw = loginServ.validUser(useracc, userpwd);
    if (validAccPsw.getCode() != EnumRESCode.SUCCESS.getCode()) {
      return "redirect:/login";
    }

    // 無誤，處理後允許登入
    // 組成加密token
    StringBuilder aesLoginMsg = new StringBuilder();
    aesLoginMsg.append(System.currentTimeMillis());
    aesLoginMsg.append("&&");
    aesLoginMsg.append(useracc);
    aesLoginMsg.append("&&");
    aesLoginMsg.append(userpwd);
    CookiesUtil.setCookie(res, "FGlogInfo", AES.AESEncode(RULEKEY, aesLoginMsg.toString()), loginServ.TOKENDAY*24*60*60);  //天 * 24 * 60 * 60 (秒)
    return "redirect:/page/home";
  }

}
