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
  @GetMapping(value = "/getSale091Repo")
  public Result getSale091Repo() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getSale091Repo2")
  public Result getSale091Repo2() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo2(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getSale091Repo3")
  public Result getSale091Repo3() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo3(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getSale091Repo4")
  public Result getSale091Repo4() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo4(orderNo);
    return rsT091;
  }
  
  @GetMapping(value = "/getSale091Repo5")
  public Result getSale091Repo5() {
    String orderNo = "000331A110106001";
    Result rsT091 = testServ.getSale05m091Repo5(orderNo);
    return rsT091;
  }
	
}
