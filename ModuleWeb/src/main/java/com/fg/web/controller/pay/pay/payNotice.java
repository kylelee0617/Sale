package com.fg.web.controller.pay.pay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;


/**
 * 繳款通知單 (含委外)
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/pay")
public class payNotice extends BaseController {

	@RequestMapping("/payNotice")
	public String custData(Model model) {
		return "page/pay/pay/payNotice/payNotice";
	}
	
}
