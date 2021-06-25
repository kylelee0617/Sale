package com.fg.service.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 所有返回訊息必須設定在這裡，沒有例外
 * @author B04391
 *
 */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EnumRESCode
{
	SUCCESS
	(0 , "success" , "成功" , "Done - 執行成功"),
	TOKENOUTOFTIME
	(2 , "tokenOutOfTime" , "憑證過期" , "desc - 憑證過期"),
	LOGINFAIL
	(3 , "loginFail" , "登入失敗" , "desc - 登入失敗"),
	ACCPSWFAIL
	(4 , "accOrPswFail" , "帳號密碼錯誤" , "desc - 帳號密碼錯誤"),
	ERROR_NETWORK
  (900 , "errorNetWork" , "網路開小差" , "Error - 網路開小差"),
	ERROR_CONNECTION
  (901 , "errorConnection" , "連線錯誤" , "Error - 連線錯誤"),
	ERROR_CLOSE
  (902 , "errorClose" , "關閉錯誤" , "Error - 元件關閉時發生錯誤"),
	ERROR
	(999 , "error" , "不明錯誤原因錯誤" , "Error - 發生不明錯誤");
	
	
	private int code;
	private String ename;
	private String cname;
	private String desc;
	
	private EnumRESCode(int code) {
	  this.code = code;
	}
	
	private EnumRESCode(int code , String ename , String cname , String desc)
	{
		this.code = code;
		this.ename = ename;
		this.cname = cname;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
