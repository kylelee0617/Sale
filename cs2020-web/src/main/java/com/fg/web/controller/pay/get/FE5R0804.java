package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0804 金融機構代收房地款日報表
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/get")
public class FE5R0804 extends BaseController {

	@RequestMapping("/drptBankGetMoney")
	public String index(Model model) {
		
		
		return "page/pay/get/FE5R0804/FE5R0804";
	}
	
}
