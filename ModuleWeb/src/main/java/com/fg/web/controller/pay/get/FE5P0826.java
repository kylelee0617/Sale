package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;


/**
 * 產生發票
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/get")
public class FE5P0826 extends BaseController {

	@RequestMapping("/getInvoice")
	public String custData(Model model) {
		
		return "page/pay/get/getInvoice/FE5P0826";
	}
	
}
