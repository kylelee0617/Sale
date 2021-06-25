package com.fg.web.controller.other.guarantee;

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
@RequestMapping("/page/other/guarantee")
public class FE5P1501 extends BaseController {

	@RequestMapping("/guaranteeOK")
	public String index(Model model) {
		
		return "page/other/guarantee/guaranteeOK/FE5P1501";
	}
	
}
