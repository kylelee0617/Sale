package com.fg.web.controller.basic.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 *  總表
 * @author 
 *
 */

@Controller
@RequestMapping("/page/basic/report")
public class total extends BaseController {

	@RequestMapping("/total")
	public String index(Model model) {
		return "page/basic/report/total/total";
	}
	
}
