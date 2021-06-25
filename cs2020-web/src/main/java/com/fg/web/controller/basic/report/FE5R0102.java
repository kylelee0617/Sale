package com.fg.web.controller.basic.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R0102 客戶資料清冊
 * @author 
 *
 */

@Controller
@RequestMapping("/page/basic/report")
public class FE5R0102 extends BaseController {

	@RequestMapping("/custDetail")
	public String index(Model model) {
		return "page/basic/report/custDetail/FE5R0102";
	}
	
	
	
}
