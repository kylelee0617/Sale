package com.fg.web.controller.pay.pjChg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5P2401 工變報表
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/pjChg")
public class FE5R1101 extends BaseController {

	@RequestMapping("/rptPjChange")
	public String index(Model model) {
		
		return "page/pay/pjChg/FE5R1101/FE5R1101";
	}
	
}
