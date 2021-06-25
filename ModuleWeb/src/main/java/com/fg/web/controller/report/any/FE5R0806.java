package com.fg.web.controller.report.any;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0901 房屋付款總表
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/report/any")
public class FE5R0806 extends BaseController {

	@RequestMapping("/housePayDetail")
	public String index(Model model) {
		
		return "page/report/any/housePayDetail/FE5R0806";
	}
	
}
