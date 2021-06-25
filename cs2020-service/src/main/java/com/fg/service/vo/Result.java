package com.fg.service.vo;

import com.fg.service.Enum.EnumRESCode;

public class Result {

  private EnumRESCode resEnum = EnumRESCode.SUCCESS;
	private Object data;
	
	public Result() {
	}
	
	public Result(EnumRESCode resEnum, Object data) {
		this.resEnum = resEnum;
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

  public EnumRESCode getResEnum() {
    return resEnum;
  }

  public void setResEnum(EnumRESCode resEnum) {
    this.resEnum = resEnum;
  }
	
	
}
