package com.fg.dao.entity.fe5d;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FE5D10 database table.
 * 
 */
@Entity
@Table(name="FE5D10")
@NamedQuery(name="Fe5d10Entity.findAll", query="SELECT f FROM Fe5d10Entity f")
public class Fe5d10Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AMT_KIND")
	private String amtKind;

	@Column(name="BANK_KIND")
	private String bankKind;

	@Column(name="CHECK_FLOW_NO")
	private int checkFlowNo;

	@Column(name="CHECK_YMD")
	private String checkYmd;

	@Column(name="DEPT_CD")
	private String deptCd;

	@Column(name="DEPT_CD_1")
	private String deptCd1;

	@Column(name="DEPT_NO")
	private String deptNo;

	@Column(name="DUE_DATE")
	private String dueDate;

	@Column(name="LIST_NO")
	private int listNo;

	@Column(name="OBJECT_CD")
	private String objectCd;

	@Column(name="OBJECT_ID")
	private String objectId;

	@Column(name="PAPER_AMT")
	private BigDecimal paperAmt;

	@Column(name="PAPER_NO")
	private String paperNo;

	@Column(name="PAPER_TRUST")
	private String paperTrust;

	@Column(name="PAY_BANK_CD")
	private String payBankCd;

	@Column(name="PAY_BANK_NO")
	private String payBankNo;

	@Column(name="PAY_MENO")
	private String payMeno;

	@Column(name="REMARK")
	private String remark;

	public Fe5d10Entity() {
	}

	public String getAmtKind() {
		return this.amtKind;
	}

	public void setAmtKind(String amtKind) {
		this.amtKind = amtKind;
	}

	public String getBankKind() {
		return this.bankKind;
	}

	public void setBankKind(String bankKind) {
		this.bankKind = bankKind;
	}

	public int getCheckFlowNo() {
		return this.checkFlowNo;
	}

	public void setCheckFlowNo(int checkFlowNo) {
		this.checkFlowNo = checkFlowNo;
	}

	public String getCheckYmd() {
		return this.checkYmd;
	}

	public void setCheckYmd(String checkYmd) {
		this.checkYmd = checkYmd;
	}

	public String getDeptCd() {
		return this.deptCd;
	}

	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}

	public String getDeptCd1() {
		return this.deptCd1;
	}

	public void setDeptCd1(String deptCd1) {
		this.deptCd1 = deptCd1;
	}

	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getListNo() {
		return this.listNo;
	}

	public void setListNo(int listNo) {
		this.listNo = listNo;
	}

	public String getObjectCd() {
		return this.objectCd;
	}

	public void setObjectCd(String objectCd) {
		this.objectCd = objectCd;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public BigDecimal getPaperAmt() {
		return this.paperAmt;
	}

	public void setPaperAmt(BigDecimal paperAmt) {
		this.paperAmt = paperAmt;
	}

	public String getPaperNo() {
		return this.paperNo;
	}

	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}

	public String getPaperTrust() {
		return this.paperTrust;
	}

	public void setPaperTrust(String paperTrust) {
		this.paperTrust = paperTrust;
	}

	public String getPayBankCd() {
		return this.payBankCd;
	}

	public void setPayBankCd(String payBankCd) {
		this.payBankCd = payBankCd;
	}

	public String getPayBankNo() {
		return this.payBankNo;
	}

	public void setPayBankNo(String payBankNo) {
		this.payBankNo = payBankNo;
	}

	public String getPayMeno() {
		return this.payMeno;
	}

	public void setPayMeno(String payMeno) {
		this.payMeno = payMeno;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}