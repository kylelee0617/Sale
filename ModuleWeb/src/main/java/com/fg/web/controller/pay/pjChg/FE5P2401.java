package com.fg.web.controller.pay.pjChg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5P2401 工變項目維護作業
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/pjChg")
public class FE5P2401 extends BaseController {

	@RequestMapping("/projectChange")
	public String index(Model model) {
		
		return "page/pay/pjChg/FE5P2401/FE5P2401";
	}
	
}
