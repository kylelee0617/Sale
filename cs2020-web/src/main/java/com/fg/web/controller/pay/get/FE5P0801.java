package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/page/pay/get")
public class FE5P0801 extends BaseController {

	@RequestMapping("/getMoney")
	public String custData(Model model) {
		
		return "page/pay/get/getMoney/FE5P0801";
	}
	
}
