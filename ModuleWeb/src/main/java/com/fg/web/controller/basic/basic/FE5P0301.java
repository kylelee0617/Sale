package com.fg.web.controller.basic.basic;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fg.service.basic.basic.FE5P0301Service;
import com.fg.service.vo.Result;
import com.fg.service.vo.basic.basic.FE5P04Vo;
import com.fg.service.vo.basic.basic.ProjectCodeVo;
import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/page/basic/basic")
public class FE5P0301 extends BaseController {

  @Autowired
  FE5P0301Service service;

  ProjectCodeVo projectCodeVo;

  @RequestMapping("/projectCode")
  public String init(Model model, @ModelAttribute(value = "projectCodeVo") ProjectCodeVo projectCodeVo,
      RedirectAttributes redParam) {
    if (projectCodeVo == null) {
      projectCodeVo = new ProjectCodeVo();
    }

    redParam.addFlashAttribute(projectCodeVo);
    return "page/basic/basic/projectCode/FE5P0301";
  }

  @RequestMapping("/insert")
  public String insert(HttpServletResponse res, @ModelAttribute(value = "projectCodeVo") ProjectCodeVo projectCodeVo) {
    String DEPT_CD_1 = projectCodeVo.getDEPT_CD_1();
    String DEPT_CD = projectCodeVo.getDEPT_CD();
    Result rs = null;
    rs = service.insert(projectCodeVo);

    return "page/basic/basic/projectCode/FE5P0301";
  }

  @RequestMapping("/doQueryFe5p04")
  public ResponseEntity<?>  queryFe5p04(@RequestBody FE5P04Vo data) {
    String dept_cd = data.getDept_cd();
    String dept_cd_1 = data.getDept_cd_1();
    Result rs = null;
    rs = service.insert(projectCodeVo);

    return new ResponseEntity<>(rs, HttpStatus.OK);
  }

}
