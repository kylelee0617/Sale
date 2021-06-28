package com.fg.web.api.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fg.service.api.test.TestApiService;
import com.fg.service.vo.Result;
import com.fg.web.controller.BaseController;

@RestController
@RequestMapping(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestApi extends BaseController {
	
	@Autowired
	TestApiService testServ;
	
	/**
   * sample
   * restful api
   * api in api
   * @return
   */
  @GetMapping(value = "/getRepo91")
  public Result getSale091Repo91() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo1(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo912")
  public Result getSale091Repo912() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo12(orderNo);
    return rsT091;
  }

  @GetMapping(value = "/getRepo913")
  public Result getSale091Repo913() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo13(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo914")
  public Result getSale091Repo914() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo14(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo915")
  public Result getSale091Repo915() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo15(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo916")
  public Result getSale091Repo916() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo16(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo917")
  public Result getSale091Repo917() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo17(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getRepo918")
  public Result getSale091Repo918() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo18(orderNo);
    return rsT091;
  }
  
  
  
  
}
