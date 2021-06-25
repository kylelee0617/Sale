package com.fg.web.zbean;

import com.fg.service.vo.Result;

public class LoginBean {
  
  private String useracc = "";
  private String userpwd = ""; 
  private Result result = null;  //登入結果
  
  public String getUseracc() {
    return useracc;
  }
  public void setUseracc(String useracc) {
    this.useracc = useracc;
  }
  
  public String getUserpwd() {
    return userpwd;
  }
  public void setUserpwd(String userpwd) {
    this.userpwd = userpwd;
  }
  
  public Result getResult() {
    return result;
  }
  public void setResult(Result result) {
    this.result = result;
  }

}
