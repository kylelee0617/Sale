package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0805 催繳明細
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/pay/call")
public class FE5R0805 extends BaseController {

	@RequestMapping("/callList")
	public String index(Model model) {
		
		return "page/pay/call/FE5R0805/FE5R0805";
	}
	
}
