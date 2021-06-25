package com.fg.web.controller.basic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * 客戶繳款明細查詢
 * @author Kyle Lee
 *
 */
@Controller
@RequestMapping("/page/basic/chgName")
public class FE5R0505 extends BaseController {

	@RequestMapping("/custPayList")
	public String index(Model model) {
		return "page/basic/chgName/FE5R0505/FE5R0505";
	}
	
}
