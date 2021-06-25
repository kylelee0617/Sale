package com.fg.web.controller.other.loan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R1504 交屋狀況明細表
 * @author 
 *
 */
@Controller
@RequestMapping("/page/other/loan")
public class FE5R1504 extends BaseController {

	@RequestMapping("/loanDetail")
	public String index(Model model) {
		
		return "page/other/loan/loanDetail/FE5R1504";
	}
	
}
