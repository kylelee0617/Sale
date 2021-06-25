package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0803 收款單列印
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/get")
public class FE5R0803 extends BaseController {

	@RequestMapping("/prtGetMoneyPaper")
	public String index(Model model) {
		
		return "page/pay/get/FE5R0803/FE5R0803";
	}
	
}
