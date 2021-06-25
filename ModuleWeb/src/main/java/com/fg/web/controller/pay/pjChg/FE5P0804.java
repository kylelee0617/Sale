package com.fg.web.controller.pay.pjChg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5P2401 繳款資料轉入
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/special")
public class FE5P0804 extends BaseController {

	@RequestMapping("/special")
	public String index(Model model) {
		
		return "page/pay/special/special/FE5P0804";
	}
	
}
