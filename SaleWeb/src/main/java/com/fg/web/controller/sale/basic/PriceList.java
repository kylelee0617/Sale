package com.fg.web.controller.sale.basic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.service.Enum.EnumRESCode;
import com.fg.service.vo.Result;
import com.fg.service.vo.basic.basic.FE5P0101Vo;
import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/sale/basic")
public class PriceList extends BaseController {

	@RequestMapping("/pricelist")
	public String index(Model model) {
		return "sale/basic/pricelist";
	}
	
	@RequestMapping("/doQuery")
	public ResponseEntity<?> doQuery( @RequestBody FE5P0101Vo data) {
		Result rs = new Result();
		List<FE5P0101Vo> list = new ArrayList<>();
		list.add(data);
		rs.setData(list);
		rs.setResEnum(EnumRESCode.SUCCESS);

		return new ResponseEntity<>(rs, HttpStatus.OK);
	}
	
	
}
