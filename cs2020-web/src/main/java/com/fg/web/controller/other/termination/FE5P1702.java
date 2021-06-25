package com.fg.web.controller.other.termination;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

/**
 * FE5P1702 解約處理
 * @author 
 *
 */
@Controller
@RequestMapping("/page/other/termination")
public class FE5P1702 extends BaseController {

	@RequestMapping("/termination")
	public String index(Model model) {
		
		return "page/other/termination/termination/FE5P1702";
	}
	
}
