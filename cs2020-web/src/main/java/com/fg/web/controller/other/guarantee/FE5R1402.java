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
public class FE5R1402 extends BaseController {

	@RequestMapping("/prtGuarantee")
	public String index(Model model) {
		
		return "page/other/guarantee/prtGuarantee/FE5R1402";
	}
	
}
