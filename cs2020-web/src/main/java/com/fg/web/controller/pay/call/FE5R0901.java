package com.fg.web.controller.pay.call;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0901 列印催繳通知
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/call")
public class FE5R0901 extends BaseController {

	@RequestMapping("/callListPaper")
	public String index(Model model) {
		
		return "page/pay/call/FE5R0901/FE5R0901";
	}
	
}
