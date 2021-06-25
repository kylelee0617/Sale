package com.fg.web.controller.pay.pay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * 委外繳款通知單
 * @author Kyle Lee
 *
 */

@Controller
@RequestMapping("/page/pay/pay")
public class opNotice extends BaseController {

	@RequestMapping("/opNotice")
	public String index(Model model) {
		return "page/pay/pay/opNotice/opNotice";
	}
	
}
