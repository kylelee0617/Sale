package com.fg.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fg.service.api.test.TestApiService;
import com.fg.service.login.LoginService;
import com.fg.service.vo.Result;
import com.fg.web.zbean.LoginBean;

@Controller
@RequestMapping("/page")
public class Home extends BaseController {
	
	@Autowired
	LoginService loginServ;
	
	@Autowired
  TestApiService testApi;

	@RequestMapping("/home")
	public String goHomePage(HttpServletRequest req, Model model, @ModelAttribute(value = "loginBean") LoginBean loginBean, RedirectAttributes attr) {
	  if (loginBean == null) {
      loginBean = new LoginBean();
    }
		attr.addFlashAttribute("loginBean", loginBean);
		return "page/index";
	}
	
}
