package com.fg.web.controller.other.loan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R1508 交屋明細表更新版
 * @author 
 *
 */
@Controller
@RequestMapping("/page/other/loan")
public class FE5R1508 extends BaseController {

	@RequestMapping("/loanUpdate")
	public String index(Model model) {
		
		return "page/other/loan/loanUpdate/FE5R1508";
	}
	
}
