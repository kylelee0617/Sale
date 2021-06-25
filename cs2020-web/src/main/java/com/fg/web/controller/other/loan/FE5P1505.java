package com.fg.web.controller.other.loan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5R1504 交屋確認處理
 * @author 
 *
 */
@Controller
@RequestMapping("/page/other/loan")
public class FE5P1505 extends BaseController {

	@RequestMapping("/loanOK")
	public String index(Model model) {
		
		return "page/other/loan/loanOK/FE5P1505";
	}
	
}
