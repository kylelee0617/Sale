package com.fg.web.controller.basic.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0501 車位資料表
 * @author 
 *
 */

@Controller
@RequestMapping("/page/basic/report")
public class FE5R0501 extends BaseController {

	@RequestMapping("/carData")
	public String index(Model model) {
		return "page/basic/report/carData/FE5R0501";
	}
	
}
