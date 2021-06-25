package com.fg.dao.entity.fe5d;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FE5D03")
public class FE5D03Entity {

	@Id
	@Column(name = "DEPT_CD")
	private String DEPT_CD;

	@Column(name = "DEPT_CD_1")
	private String DEPT_CD_1;

	@Column(name = "DEPT_NAME")
	private String DEPT_NAME;

	@Column(name = "COMPANY_CD")
	private String COMPANY_CD;

	@Column(name = "COMPANY_CD_2")
	private String COMPANY_CD_2;

	@Column(name = "MAKE_DATE")
	private String MAKE_DATE;

	@Column(name = "MAKE_NO")
	private String MAKE_NO;

	@Column(name = "START_DATE")
	private String START_DATE;

	@Column(name = "DOOR_PLATE")
	private String DOOR_PLATE;

	@Column(name = "LAND_PERCENT")
	private BigDecimal LAND_PERCENT;

	@Column(name = "PREFAB_PERCENT")
	private BigDecimal PREFAB_PERCENT;

	@Column(name = "CAR_PREFAB_PERCENT")
	private BigDecimal CAR_PREFAB_PERCENT;

	@Column(name = "CAR_LAND_PERCENT")
	private BigDecimal CAR_LAND_PERCENT;

	@Column(name = "CERTIFICATE_DATE")
	private String CERTIFICATE_DATE;

	@Column(name = "CERTIFICATE_NO")
	private String CERTIFICATE_NO;

	@Column(name = "DOOR_SALE_NUM")
	private int DOOR_SALE_NUM;

	@Column(name = "DOOR_LAND_NUM")
	private int DOOR_LAND_NUM;

	@Column(name = "GARAGE_NUM")
	private int GARAGE_NUM;

	@Column(name = "MEND_PERCENT")
	private BigDecimal MEND_PERCENT;

	@Column(name = "BANK_TCD")
	private String BANK_TCD;

	@Column(name = "BANK_CD")
	private String BANK_CD;

	@Column(name = "BANK_NO")
	private String BANK_NO;

	@Column(name = "BANK_NAME")
	private String BANK_NAME;

	@Column(name = "BANK_KIND")
	private String BANK_KIND;

	@Column(name = "BANK_TCD_2")
	private String BANK_TCD_2;

	@Column(name = "BANK_CD_2")
	private String BANK_CD_2;

	@Column(name = "BANK_NO_2")
	private String BANK_NO_2;

	@Column(name = "BANK_NAME_2")
	private String BANK_NAME_2;

	@Column(name = "BANK_KIND_2")
	private String BANK_KIND_2;

	@Column(name = "BANK_DATE")
	private String BANK_DATE;

	@Column(name = "MANAGE_CD")
	private String MANAGE_CD;

	@Column(name = "MANAGE_NUM")
	private BigDecimal MANAGE_NUM;

	@Column(name = "DECORATE_CD")
	private String DECORATE_CD;

	@Column(name = "DECORATE_NUM")
	private BigDecimal DECORATE_NUM;

	@Column(name = "FUND_CD")
	private String FUND_CD;

	@Column(name = "FUND_NUM")
	private BigDecimal FUND_NUM;

	@Column(name = "DATE_TYPE")
	private String DATE_TYPE;

	@Column(name = "LAST_USER")
	private String LAST_USER;

	@Column(name = "LAST_YMD")
	private String LAST_YMD;

	@Column(name = "OVERDUE_PERCENT")
	private BigDecimal OVERDUE_PERCENT;

	@Column(name = "ACCT_DEPT_CD")
	private String ACCT_DEPT_CD;

	@Column(name = "CASE_KIND")
	private String CASE_KIND;

	@Column(name = "CLOSE_FLAG")
	private String CLOSE_FLAG;

	@Column(name = "ACCOUNT_KIND")
	private String ACCOUNT_KIND;

	@Column(name = "VIRTUAL_BANK_NO_3")
	private String VIRTUAL_BANK_NO_3;

	@Column(name = "MANAGE_UNIT")
	private BigDecimal MANAGE_UNIT;

	@Column(name = "CLEAN_CD")
	private String CLEAN_CD;

	@Column(name = "CLEAN_NUM")
	private BigDecimal CLEAN_NUM;

	@Column(name = "INVOICE_KIND")
	private String INVOICE_KIND;

	@Column(name = "INVOICE_COMPANY_CD")
	private String INVOICE_COMPANY_CD;

	@Column(name = "INVOICE_KIND_2")
	private String INVOICE_KIND_2;

	@Column(name = "INVOICE_COMPANY_CD_2")
	private String INVOICE_COMPANY_CD_2;

	@Column(name = "CAR_MANAGE_NUM")
	private int CAR_MANAGE_NUM;

	@Column(name = "TRUST_DATE")
	private String TRUST_DATE;

	@Column(name = "CAR2_MANAGE_NUM")
	private BigDecimal CAR2_MANAGE_NUM;

	@Column(name = "TBANK_TCD")
	private String TBANK_TCD;

	@Column(name = "TBANK_CD")
	private String TBANK_CD;

	@Column(name = "TBANK_NO")
	private String TBANK_NO;

	@Column(name = "TBANK_NAME")
	private String TBANK_NAME;

	@Column(name = "TBANK_TCD_2")
	private String TBANK_TCD_2;

	@Column(name = "TBANK_CD_2")
	private String TBANK_CD_2;

	@Column(name = "TBANK_NO_2")
	private String TBANK_NO_2;

	@Column(name = "TBANK_NAME_2")
	private String TBANK_NAME_2;

	@Column(name = "TCOMPANY_CD")
	private String TCOMPANY_CD;

	@Column(name = "TCOMPANY_CD_2")
	private String TCOMPANY_CD_2;

	@Column(name = "OPEN_FLAG")
	private String OPEN_FLAG;

	@Column(name = "VIRTUAL_BANK_NO_T")
	private String VIRTUAL_BANK_NO_T;


	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getDEPT_CD_1() {
		return DEPT_CD_1;
	}
	public void setDEPT_CD_1(String dEPT_CD_1) {
		DEPT_CD_1 = dEPT_CD_1;
	}
	public String getDEPT_NAME() {
		return DEPT_NAME;
	}
	public void setDEPT_NAME(String dEPT_NAME) {
		DEPT_NAME = dEPT_NAME;
	}
	public String getCOMPANY_CD() {
		return COMPANY_CD;
	}
	public void setCOMPANY_CD(String cOMPANY_CD) {
		COMPANY_CD = cOMPANY_CD;
	}
	public String getCOMPANY_CD_2() {
		return COMPANY_CD_2;
	}
	public void setCOMPANY_CD_2(String cOMPANY_CD_2) {
		COMPANY_CD_2 = cOMPANY_CD_2;
	}
	public String getMAKE_DATE() {
		return MAKE_DATE;
	}
	public void setMAKE_DATE(String mAKE_DATE) {
		MAKE_DATE = mAKE_DATE;
	}
	public String getMAKE_NO() {
		return MAKE_NO;
	}
	public void setMAKE_NO(String mAKE_NO) {
		MAKE_NO = mAKE_NO;
	}
	public String getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public String getDOOR_PLATE() {
		return DOOR_PLATE;
	}
	public void setDOOR_PLATE(String dOOR_PLATE) {
		DOOR_PLATE = dOOR_PLATE;
	}
	public BigDecimal getLAND_PERCENT() {
		return LAND_PERCENT;
	}
	public void setLAND_PERCENT(BigDecimal lAND_PERCENT) {
		LAND_PERCENT = lAND_PERCENT;
	}
	public BigDecimal getPREFAB_PERCENT() {
		return PREFAB_PERCENT;
	}
	public void setPREFAB_PERCENT(BigDecimal pREFAB_PERCENT) {
		PREFAB_PERCENT = pREFAB_PERCENT;
	}
	public BigDecimal getCAR_PREFAB_PERCENT() {
		return CAR_PREFAB_PERCENT;
	}
	public void setCAR_PREFAB_PERCENT(BigDecimal cAR_PREFAB_PERCENT) {
		CAR_PREFAB_PERCENT = cAR_PREFAB_PERCENT;
	}
	public BigDecimal getCAR_LAND_PERCENT() {
		return CAR_LAND_PERCENT;
	}
	public void setCAR_LAND_PERCENT(BigDecimal cAR_LAND_PERCENT) {
		CAR_LAND_PERCENT = cAR_LAND_PERCENT;
	}
	public String getCERTIFICATE_DATE() {
		return CERTIFICATE_DATE;
	}
	public void setCERTIFICATE_DATE(String cERTIFICATE_DATE) {
		CERTIFICATE_DATE = cERTIFICATE_DATE;
	}
	public String getCERTIFICATE_NO() {
		return CERTIFICATE_NO;
	}
	public void setCERTIFICATE_NO(String cERTIFICATE_NO) {
		CERTIFICATE_NO = cERTIFICATE_NO;
	}
	public int getDOOR_SALE_NUM() {
		return DOOR_SALE_NUM;
	}
	public void setDOOR_SALE_NUM(int dOOR_SALE_NUM) {
		DOOR_SALE_NUM = dOOR_SALE_NUM;
	}
	public int getDOOR_LAND_NUM() {
		return DOOR_LAND_NUM;
	}
	public void setDOOR_LAND_NUM(int dOOR_LAND_NUM) {
		DOOR_LAND_NUM = dOOR_LAND_NUM;
	}
	public int getGARAGE_NUM() {
		return GARAGE_NUM;
	}
	public void setGARAGE_NUM(int gARAGE_NUM) {
		GARAGE_NUM = gARAGE_NUM;
	}
	public BigDecimal getMEND_PERCENT() {
		return MEND_PERCENT;
	}
	public void setMEND_PERCENT(BigDecimal mEND_PERCENT) {
		MEND_PERCENT = mEND_PERCENT;
	}
	public String getBANK_TCD() {
		return BANK_TCD;
	}
	public void setBANK_TCD(String bANK_TCD) {
		BANK_TCD = bANK_TCD;
	}
	public String getBANK_CD() {
		return BANK_CD;
	}
	public void setBANK_CD(String bANK_CD) {
		BANK_CD = bANK_CD;
	}
	public String getBANK_NO() {
		return BANK_NO;
	}
	public void setBANK_NO(String bANK_NO) {
		BANK_NO = bANK_NO;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public String getBANK_KIND() {
		return BANK_KIND;
	}
	public void setBANK_KIND(String bANK_KIND) {
		BANK_KIND = bANK_KIND;
	}
	public String getBANK_TCD_2() {
		return BANK_TCD_2;
	}
	public void setBANK_TCD_2(String bANK_TCD_2) {
		BANK_TCD_2 = bANK_TCD_2;
	}
	public String getBANK_CD_2() {
		return BANK_CD_2;
	}
	public void setBANK_CD_2(String bANK_CD_2) {
		BANK_CD_2 = bANK_CD_2;
	}
	public String getBANK_NO_2() {
		return BANK_NO_2;
	}
	public void setBANK_NO_2(String bANK_NO_2) {
		BANK_NO_2 = bANK_NO_2;
	}
	public String getBANK_NAME_2() {
		return BANK_NAME_2;
	}
	public void setBANK_NAME_2(String bANK_NAME_2) {
		BANK_NAME_2 = bANK_NAME_2;
	}
	public String getBANK_KIND_2() {
		return BANK_KIND_2;
	}
	public void setBANK_KIND_2(String bANK_KIND_2) {
		BANK_KIND_2 = bANK_KIND_2;
	}
	public String getBANK_DATE() {
		return BANK_DATE;
	}
	public void setBANK_DATE(String bANK_DATE) {
		BANK_DATE = bANK_DATE;
	}
	public String getMANAGE_CD() {
		return MANAGE_CD;
	}
	public void setMANAGE_CD(String mANAGE_CD) {
		MANAGE_CD = mANAGE_CD;
	}
	public BigDecimal getMANAGE_NUM() {
		return MANAGE_NUM;
	}
	public void setMANAGE_NUM(BigDecimal mANAGE_NUM) {
		MANAGE_NUM = mANAGE_NUM;
	}
	public String getDECORATE_CD() {
		return DECORATE_CD;
	}
	public void setDECORATE_CD(String dECORATE_CD) {
		DECORATE_CD = dECORATE_CD;
	}
	public BigDecimal getDECORATE_NUM() {
		return DECORATE_NUM;
	}
	public void setDECORATE_NUM(BigDecimal dECORATE_NUM) {
		DECORATE_NUM = dECORATE_NUM;
	}
	public String getFUND_CD() {
		return FUND_CD;
	}
	public void setFUND_CD(String fUND_CD) {
		FUND_CD = fUND_CD;
	}
	public BigDecimal getFUND_NUM() {
		return FUND_NUM;
	}
	public void setFUND_NUM(BigDecimal fUND_NUM) {
		FUND_NUM = fUND_NUM;
	}
	public String getDATE_TYPE() {
		return DATE_TYPE;
	}
	public void setDATE_TYPE(String dATE_TYPE) {
		DATE_TYPE = dATE_TYPE;
	}
	public String getLAST_USER() {
		return LAST_USER;
	}
	public void setLAST_USER(String lAST_USER) {
		LAST_USER = lAST_USER;
	}
	public String getLAST_YMD() {
		return LAST_YMD;
	}
	public void setLAST_YMD(String lAST_YMD) {
		LAST_YMD = lAST_YMD;
	}
	public BigDecimal getOVERDUE_PERCENT() {
		return OVERDUE_PERCENT;
	}
	public void setOVERDUE_PERCENT(BigDecimal oVERDUE_PERCENT) {
		OVERDUE_PERCENT = oVERDUE_PERCENT;
	}
	public String getACCT_DEPT_CD() {
		return ACCT_DEPT_CD;
	}
	public void setACCT_DEPT_CD(String aCCT_DEPT_CD) {
		ACCT_DEPT_CD = aCCT_DEPT_CD;
	}
	public String getCASE_KIND() {
		return CASE_KIND;
	}
	public void setCASE_KIND(String cASE_KIND) {
		CASE_KIND = cASE_KIND;
	}
	public String getCLOSE_FLAG() {
		return CLOSE_FLAG;
	}
	public void setCLOSE_FLAG(String cLOSE_FLAG) {
		CLOSE_FLAG = cLOSE_FLAG;
	}
	public String getACCOUNT_KIND() {
		return ACCOUNT_KIND;
	}
	public void setACCOUNT_KIND(String aCCOUNT_KIND) {
		ACCOUNT_KIND = aCCOUNT_KIND;
	}
	public String getVIRTUAL_BANK_NO_3() {
		return VIRTUAL_BANK_NO_3;
	}
	public void setVIRTUAL_BANK_NO_3(String vIRTUAL_BANK_NO_3) {
		VIRTUAL_BANK_NO_3 = vIRTUAL_BANK_NO_3;
	}
	public BigDecimal getMANAGE_UNIT() {
		return MANAGE_UNIT;
	}
	public void setMANAGE_UNIT(BigDecimal mANAGE_UNIT) {
		MANAGE_UNIT = mANAGE_UNIT;
	}
	public String getCLEAN_CD() {
		return CLEAN_CD;
	}
	public void setCLEAN_CD(String cLEAN_CD) {
		CLEAN_CD = cLEAN_CD;
	}
	public BigDecimal getCLEAN_NUM() {
		return CLEAN_NUM;
	}
	public void setCLEAN_NUM(BigDecimal cLEAN_NUM) {
		CLEAN_NUM = cLEAN_NUM;
	}
	public String getINVOICE_KIND() {
		return INVOICE_KIND;
	}
	public void setINVOICE_KIND(String iNVOICE_KIND) {
		INVOICE_KIND = iNVOICE_KIND;
	}
	public String getINVOICE_COMPANY_CD() {
		return INVOICE_COMPANY_CD;
	}
	public void setINVOICE_COMPANY_CD(String iNVOICE_COMPANY_CD) {
		INVOICE_COMPANY_CD = iNVOICE_COMPANY_CD;
	}
	public String getINVOICE_KIND_2() {
		return INVOICE_KIND_2;
	}
	public void setINVOICE_KIND_2(String iNVOICE_KIND_2) {
		INVOICE_KIND_2 = iNVOICE_KIND_2;
	}
	public String getINVOICE_COMPANY_CD_2() {
		return INVOICE_COMPANY_CD_2;
	}
	public void setINVOICE_COMPANY_CD_2(String iNVOICE_COMPANY_CD_2) {
		INVOICE_COMPANY_CD_2 = iNVOICE_COMPANY_CD_2;
	}
	public int getCAR_MANAGE_NUM() {
		return CAR_MANAGE_NUM;
	}
	public void setCAR_MANAGE_NUM(int cAR_MANAGE_NUM) {
		CAR_MANAGE_NUM = cAR_MANAGE_NUM;
	}
	public String getTRUST_DATE() {
		return TRUST_DATE;
	}
	public void setTRUST_DATE(String tRUST_DATE) {
		TRUST_DATE = tRUST_DATE;
	}
	public BigDecimal getCAR2_MANAGE_NUM() {
		return CAR2_MANAGE_NUM;
	}
	public void setCAR2_MANAGE_NUM(BigDecimal cAR2_MANAGE_NUM) {
		CAR2_MANAGE_NUM = cAR2_MANAGE_NUM;
	}
	public String getTBANK_TCD() {
		return TBANK_TCD;
	}
	public void setTBANK_TCD(String tBANK_TCD) {
		TBANK_TCD = tBANK_TCD;
	}
	public String getTBANK_CD() {
		return TBANK_CD;
	}
	public void setTBANK_CD(String tBANK_CD) {
		TBANK_CD = tBANK_CD;
	}
	public String getTBANK_NO() {
		return TBANK_NO;
	}
	public void setTBANK_NO(String tBANK_NO) {
		TBANK_NO = tBANK_NO;
	}
	public String getTBANK_NAME() {
		return TBANK_NAME;
	}
	public void setTBANK_NAME(String tBANK_NAME) {
		TBANK_NAME = tBANK_NAME;
	}
	public String getTBANK_TCD_2() {
		return TBANK_TCD_2;
	}
	public void setTBANK_TCD_2(String tBANK_TCD_2) {
		TBANK_TCD_2 = tBANK_TCD_2;
	}
	public String getTBANK_CD_2() {
		return TBANK_CD_2;
	}
	public void setTBANK_CD_2(String tBANK_CD_2) {
		TBANK_CD_2 = tBANK_CD_2;
	}
	public String getTBANK_NO_2() {
		return TBANK_NO_2;
	}
	public void setTBANK_NO_2(String tBANK_NO_2) {
		TBANK_NO_2 = tBANK_NO_2;
	}
	public String getTBANK_NAME_2() {
		return TBANK_NAME_2;
	}
	public void setTBANK_NAME_2(String tBANK_NAME_2) {
		TBANK_NAME_2 = tBANK_NAME_2;
	}
	public String getTCOMPANY_CD() {
		return TCOMPANY_CD;
	}
	public void setTCOMPANY_CD(String tCOMPANY_CD) {
		TCOMPANY_CD = tCOMPANY_CD;
	}
	public String getTCOMPANY_CD_2() {
		return TCOMPANY_CD_2;
	}
	public void setTCOMPANY_CD_2(String tCOMPANY_CD_2) {
		TCOMPANY_CD_2 = tCOMPANY_CD_2;
	}
	public String getOPEN_FLAG() {
		return OPEN_FLAG;
	}
	public void setOPEN_FLAG(String oPEN_FLAG) {
		OPEN_FLAG = oPEN_FLAG;
	}
	public String getVIRTUAL_BANK_NO_T() {
		return VIRTUAL_BANK_NO_T;
	}
	public void setVIRTUAL_BANK_NO_T(String vIRTUAL_BANK_NO_T) {
		VIRTUAL_BANK_NO_T = vIRTUAL_BANK_NO_T;
	}

	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("; ACCOUNT_KIND=").append(ACCOUNT_KIND)
		  .append("; ACCT_DEPT_CD=").append(ACCT_DEPT_CD)
		  .append("; BANK_CD=").append(BANK_CD)
		  .append("; BANK_CD_2=").append(BANK_CD_2)
		  .append("; BANK_DATE=").append(BANK_DATE)
		  .append("; BANK_KIND=").append(BANK_KIND)
		  .append("; BANK_KIND_2=").append(BANK_KIND_2)
		  .append("; BANK_NAME=").append(BANK_NAME)
		  .append("; BANK_NAME_2=").append(BANK_NAME_2)
		  .append("; BANK_NO=").append(BANK_NO)
		  .append("; BANK_NO_2=").append(BANK_NO_2)
		  .append("; BANK_TCD=").append(BANK_TCD)
		  .append("; BANK_TCD_2=").append(BANK_TCD_2)
		  .append("; CAR2_MANAGE_NUM=").append(CAR2_MANAGE_NUM)
		  .append("; CAR_LAND_PERCENT=").append(CAR_LAND_PERCENT)
		  .append("; CAR_MANAGE_NUM=").append(CAR_MANAGE_NUM)
		  .append("; CAR_PREFAB_PERCENT=").append(CAR_PREFAB_PERCENT)
		  .append("; CASE_KIND=").append(CASE_KIND)
		  .append("; CERTIFICATE_DATE=").append(CERTIFICATE_DATE)
		  .append("; CERTIFICATE_NO=").append(CERTIFICATE_NO)
		  .append("; CLEAN_CD=").append(CLEAN_CD)
		  .append("; CLEAN_NUM=").append(CLEAN_NUM)
		  .append("; CLOSE_FLAG=").append(CLOSE_FLAG)
		  .append("; COMPANY_CD=").append(COMPANY_CD)
		  .append("; COMPANY_CD_2=").append(COMPANY_CD_2)
		  .append("; DATE_TYPE=").append(DATE_TYPE)
		  .append("; DECORATE_CD=").append(DECORATE_CD)
		  .append("; DECORATE_NUM=").append(DECORATE_NUM)
		  .append("; DEPT_CD_1=").append(DEPT_CD_1)
		  .append("; DEPT_NAME=").append(DEPT_NAME)
		  .append("; DOOR_LAND_NUM=").append(DOOR_LAND_NUM)
		  .append("; DOOR_PLATE=").append(DOOR_PLATE)
		  .append("; DOOR_SALE_NUM=").append(DOOR_SALE_NUM)
		  .append("; FUND_CD=").append(FUND_CD)
		  .append("; FUND_NUM=").append(FUND_NUM)
		  .append("; GARAGE_NUM=").append(GARAGE_NUM)
		  .append("; INVOICE_COMPANY_CD=").append(INVOICE_COMPANY_CD)
		  .append("; INVOICE_COMPANY_CD_2=").append(INVOICE_COMPANY_CD_2)
		  .append("; INVOICE_KIND=").append(INVOICE_KIND)
		  .append("; INVOICE_KIND_2=").append(INVOICE_KIND_2)
		  .append("; LAND_PERCENT=").append(LAND_PERCENT)
		  .append("; LAST_USER=").append(LAST_USER)
		  .append("; LAST_YMD=").append(LAST_YMD)
		  .append("; MAKE_DATE=").append(MAKE_DATE)
		  .append("; MAKE_NO=").append(MAKE_NO)
		  .append("; MANAGE_CD=").append(MANAGE_CD)
		  .append("; MANAGE_NUM=").append(MANAGE_NUM)
		  .append("; MANAGE_UNIT=").append(MANAGE_UNIT)
		  .append("; MEND_PERCENT=").append(MEND_PERCENT)
		  .append("; OPEN_FLAG=").append(OPEN_FLAG)
		  .append("; OVERDUE_PERCENT=").append(OVERDUE_PERCENT)
		  .append("; PREFAB_PERCENT=").append(PREFAB_PERCENT)
		  .append("; START_DATE=").append(START_DATE)
		  .append("; TBANK_CD=").append(TBANK_CD)
		  .append("; TBANK_CD_2=").append(TBANK_CD_2)
		  .append("; TBANK_NAME=").append(TBANK_NAME)
		  .append("; TBANK_NAME_2=").append(TBANK_NAME_2)
		  .append("; TBANK_NO=").append(TBANK_NO)
		  .append("; TBANK_NO_2=").append(TBANK_NO_2)
		  .append("; TBANK_TCD=").append(TBANK_TCD)
		  .append("; TBANK_TCD_2=").append(TBANK_TCD_2)
		  .append("; TCOMPANY_CD=").append(TCOMPANY_CD)
		  .append("; TCOMPANY_CD_2=").append(TCOMPANY_CD_2)
		  .append("; TRUST_DATE=").append(TRUST_DATE)
		  .append("; VIRTUAL_BANK_NO_3=").append(VIRTUAL_BANK_NO_3)
		  .append("; VIRTUAL_BANK_NO_T=").append(VIRTUAL_BANK_NO_T)
		  .append("; DEPT_CD=").append(DEPT_CD);
		return sb.toString();
	}


	//	@Id
//	@Column(name = "dept_cd")
//	private String dept_cd;
//	
//	@Column(name = "dept_cd_1")
//	private String dept_cd_1;
//	
//	@Column(name = "object_cd")
//	private String object_cd;
//	
//	@Column(name = "object_cd_work")
//	private String object_cd_work;
//	
//	@Column(name = "object_short_name")
//	private String object_short_name;
//	
//	@Column(name = "object_full_name")
//	private String object_full_name;
//	
//	@Column(name = "object_eng_name")
//	private String object_eng_name;
//	
//	@Column(name = "object_type")
//	private String object_type;
//	
//	@Column(name = "door_plate")
//	private String door_plate;
//	
//	@Column(name = "object_id")
//	private String object_id;
//	
//	@Column(name = "object_birthday")
//	private String object_birthday;
//	
//	@Column(name = "chairman")
//	private String chairman;
//	
//	@Column(name = "contact_man")
//	private String contact_man;
//	
//	@Column(name = "company_tel_no")
//	private String company_tel_no;
//	
//	@Column(name = "company_fax_no")
//	private String company_fax_no;
//	
//	@Column(name = "invoice_addr")
//	private String invoice_addr;
//	
//	@Column(name = "tel_no")
//	private String tel_no;
//	
//	@Column(name = "mail_addr")
//	private String mail_addr;
//	
//	@Column(name = "sale_person")
//	private String sale_person;
//	
//	@Column(name = "agency_cd")
//	private String agency_cd;
//	
//	@Column(name = "sale_prize")
//	private BigDecimal sale_prize;
//	
//	@Column(name = "apply_date")
//	private String apply_date;
//	
//	@Column(name = "record_unit")
//	private BigDecimal record_unit;
//	
//	@Column(name = "sale_unit")
//	private BigDecimal sale_unit;
//	
//	@Column(name = "appoint_amt")
//	private BigDecimal appoint_amt;
//	
//	@Column(name = "sale_amt")
//	private BigDecimal sale_amt;
//	
//	@Column(name = "appoint_date")
//	private String appoint_date;
//	
//	@Column(name = "gift_amt")
//	private BigDecimal gift_amt;
//	
//	@Column(name = "self_amt")
//	private BigDecimal self_amt;
//	
//	@Column(name = "reserve_amt")
//	private BigDecimal reserve_amt;
//	
//	@Column(name = "soft_loan")
//	private BigDecimal soft_loan;
//	
//	@Column(name = "bank_amt")
//	private BigDecimal bank_amt;
//	
//	@Column(name = "load_cd")
//	private String load_cd;
//	
//	@Column(name = "year_end")
//	private int year_end;
//	
//	@Column(name = "bank_date")
//	private String bank_date;
//	
//	@Column(name = "contract_cd")
//	private String contract_cd;
//	
//	@Column(name = "car_contract_cd")
//	private String car_contract_cd;
//	
//	@Column(name = "car_appoint_amt")
//	private BigDecimal car_appoint_amt;
//	
//	@Column(name = "car_sale_amt")
//	private BigDecimal car_sale_amt;
//	
//	@Column(name = "car_gift_amt")
//	private BigDecimal car_gift_amt;
//	
//	@Column(name = "car_reserve_amt")
//	private BigDecimal car_reserve_amt;
//	
//	@Column(name = "car_self_amt")
//	private BigDecimal car_self_amt;
//	
//	@Column(name = "car_bank_amt")
//	private BigDecimal car_bank_amt;
//	
//	@Column(name = "acct_dept_cd")
//	private String acct_dept_cd;
//	
//	@Column(name = "status_cd")
//	private String status_cd;
//	
//	@Column(name = "last_user")
//	private String last_user;
//	
//	@Column(name = "last_ymd")
//	private String last_ymd;
//	
//	@Column(name = "car_apply_date")
//	private String car_apply_date;
//	
//	@Column(name = "car_sale_prize")
//	private BigDecimal car_sale_prize;
//	
//	@Column(name = "email")
//	private String email;
//	
//	@Column(name = "port_phone")
//	private String port_phone;
//	
//	@Column(name = "virtual_bank_no")
//	private String virtual_bank_no;
//	
//	@Column(name = "check_no")
//	private String check_no;
//	
//	@Column(name = "gift_unit")
//	private BigDecimal gift_unit;
//	
//	@Column(name = "mail_type")
//	private String mail_type;
//	
//	@Column(name = "trust")
//	private String trust;
//	
//	@Column(name = "virtual_bank_no_t")
//	private String virtual_bank_no_t;
//	
//	@Column(name = "check_no_t")
//	private String check_no_t;
//	
//	@Column(name = "verno")
//	private String verno;
//	
//	@Column(name = "contract")
//	private String contract;
//
//	public String getDept_cd() {
//		return dept_cd;
//	}
//	public void setDept_cd(String dept_cd) {
//		this.dept_cd = dept_cd;
//	}
//	public String getDept_cd_1() {
//		return dept_cd_1;
//	}
//	public void setDept_cd_1(String dept_cd_1) {
//		this.dept_cd_1 = dept_cd_1;
//	}
//	public String getObject_cd() {
//		return object_cd;
//	}
//	public void setObject_cd(String object_cd) {
//		this.object_cd = object_cd;
//	}
//	public String getObject_cd_work() {
//		return object_cd_work;
//	}
//	public void setObject_cd_work(String object_cd_work) {
//		this.object_cd_work = object_cd_work;
//	}
//	public String getObject_short_name() {
//		return object_short_name;
//	}
//	public void setObject_short_name(String object_short_name) {
//		this.object_short_name = object_short_name;
//	}
//	public String getObject_full_name() {
//		return object_full_name;
//	}
//	public void setObject_full_name(String object_full_name) {
//		this.object_full_name = object_full_name;
//	}
//	public String getObject_eng_name() {
//		return object_eng_name;
//	}
//	public void setObject_eng_name(String object_eng_name) {
//		this.object_eng_name = object_eng_name;
//	}
//	public String getObject_type() {
//		return object_type;
//	}
//	public void setObject_type(String object_type) {
//		this.object_type = object_type;
//	}
//	public String getDoor_plate() {
//		return door_plate;
//	}
//	public void setDoor_plate(String door_plate) {
//		this.door_plate = door_plate;
//	}
//	public String getObject_id() {
//		return object_id;
//	}
//	public void setObject_id(String object_id) {
//		this.object_id = object_id;
//	}
//	public String getObject_birthday() {
//		return object_birthday;
//	}
//	public void setObject_birthday(String object_birthday) {
//		this.object_birthday = object_birthday;
//	}
//	public String getChairman() {
//		return chairman;
//	}
//	public void setChairman(String chairman) {
//		this.chairman = chairman;
//	}
//	public String getContact_man() {
//		return contact_man;
//	}
//	public void setContact_man(String contact_man) {
//		this.contact_man = contact_man;
//	}
//	public String getCompany_tel_no() {
//		return company_tel_no;
//	}
//	public void setCompany_tel_no(String company_tel_no) {
//		this.company_tel_no = company_tel_no;
//	}
//	public String getCompany_fax_no() {
//		return company_fax_no;
//	}
//	public void setCompany_fax_no(String company_fax_no) {
//		this.company_fax_no = company_fax_no;
//	}
//	public String getInvoice_addr() {
//		return invoice_addr;
//	}
//	public void setInvoice_addr(String invoice_addr) {
//		this.invoice_addr = invoice_addr;
//	}
//	public String getTel_no() {
//		return tel_no;
//	}
//	public void setTel_no(String tel_no) {
//		this.tel_no = tel_no;
//	}
//	public String getMail_addr() {
//		return mail_addr;
//	}
//	public void setMail_addr(String mail_addr) {
//		this.mail_addr = mail_addr;
//	}
//	public String getSale_person() {
//		return sale_person;
//	}
//	public void setSale_person(String sale_person) {
//		this.sale_person = sale_person;
//	}
//	public String getAgency_cd() {
//		return agency_cd;
//	}
//	public void setAgency_cd(String agency_cd) {
//		this.agency_cd = agency_cd;
//	}
//	public BigDecimal getSale_prize() {
//		return sale_prize;
//	}
//	public void setSale_prize(BigDecimal sale_prize) {
//		this.sale_prize = sale_prize;
//	}
//	public String getApply_date() {
//		return apply_date;
//	}
//	public void setApply_date(String apply_date) {
//		this.apply_date = apply_date;
//	}
//	public BigDecimal getRecord_unit() {
//		return record_unit;
//	}
//	public void setRecord_unit(BigDecimal record_unit) {
//		this.record_unit = record_unit;
//	}
//	public BigDecimal getSale_unit() {
//		return sale_unit;
//	}
//	public void setSale_unit(BigDecimal sale_unit) {
//		this.sale_unit = sale_unit;
//	}
//	public BigDecimal getAppoint_amt() {
//		return appoint_amt;
//	}
//	public void setAppoint_amt(BigDecimal appoint_amt) {
//		this.appoint_amt = appoint_amt;
//	}
//	public BigDecimal getSale_amt() {
//		return sale_amt;
//	}
//	public void setSale_amt(BigDecimal sale_amt) {
//		this.sale_amt = sale_amt;
//	}
//	public String getAppoint_date() {
//		return appoint_date;
//	}
//	public void setAppoint_date(String appoint_date) {
//		this.appoint_date = appoint_date;
//	}
//	public BigDecimal getGift_amt() {
//		return gift_amt;
//	}
//	public void setGift_amt(BigDecimal gift_amt) {
//		this.gift_amt = gift_amt;
//	}
//	public BigDecimal getSelf_amt() {
//		return self_amt;
//	}
//	public void setSelf_amt(BigDecimal self_amt) {
//		this.self_amt = self_amt;
//	}
//	public BigDecimal getReserve_amt() {
//		return reserve_amt;
//	}
//	public void setReserve_amt(BigDecimal reserve_amt) {
//		this.reserve_amt = reserve_amt;
//	}
//	public BigDecimal getSoft_loan() {
//		return soft_loan;
//	}
//	public void setSoft_loan(BigDecimal soft_loan) {
//		this.soft_loan = soft_loan;
//	}
//	public BigDecimal getBank_amt() {
//		return bank_amt;
//	}
//	public void setBank_amt(BigDecimal bank_amt) {
//		this.bank_amt = bank_amt;
//	}
//	public String getLoad_cd() {
//		return load_cd;
//	}
//	public void setLoad_cd(String load_cd) {
//		this.load_cd = load_cd;
//	}
//	public int getYear_end() {
//		return year_end;
//	}
//	public void setYear_end(int year_end) {
//		this.year_end = year_end;
//	}
//	public String getBank_date() {
//		return bank_date;
//	}
//	public void setBank_date(String bank_date) {
//		this.bank_date = bank_date;
//	}
//	public String getContract_cd() {
//		return contract_cd;
//	}
//	public void setContract_cd(String contract_cd) {
//		this.contract_cd = contract_cd;
//	}
//	public String getCar_contract_cd() {
//		return car_contract_cd;
//	}
//	public void setCar_contract_cd(String car_contract_cd) {
//		this.car_contract_cd = car_contract_cd;
//	}
//	public BigDecimal getCar_appoint_amt() {
//		return car_appoint_amt;
//	}
//	public void setCar_appoint_amt(BigDecimal car_appoint_amt) {
//		this.car_appoint_amt = car_appoint_amt;
//	}
//	public BigDecimal getCar_sale_amt() {
//		return car_sale_amt;
//	}
//	public void setCar_sale_amt(BigDecimal car_sale_amt) {
//		this.car_sale_amt = car_sale_amt;
//	}
//	public BigDecimal getCar_gift_amt() {
//		return car_gift_amt;
//	}
//	public void setCar_gift_amt(BigDecimal car_gift_amt) {
//		this.car_gift_amt = car_gift_amt;
//	}
//	public BigDecimal getCar_reserve_amt() {
//		return car_reserve_amt;
//	}
//	public void setCar_reserve_amt(BigDecimal car_reserve_amt) {
//		this.car_reserve_amt = car_reserve_amt;
//	}
//	public BigDecimal getCar_self_amt() {
//		return car_self_amt;
//	}
//	public void setCar_self_amt(BigDecimal car_self_amt) {
//		this.car_self_amt = car_self_amt;
//	}
//	public BigDecimal getCar_bank_amt() {
//		return car_bank_amt;
//	}
//	public void setCar_bank_amt(BigDecimal car_bank_amt) {
//		this.car_bank_amt = car_bank_amt;
//	}
//	public String getAcct_dept_cd() {
//		return acct_dept_cd;
//	}
//	public void setAcct_dept_cd(String acct_dept_cd) {
//		this.acct_dept_cd = acct_dept_cd;
//	}
//	public String getStatus_cd() {
//		return status_cd;
//	}
//	public void setStatus_cd(String status_cd) {
//		this.status_cd = status_cd;
//	}
//	public String getLast_user() {
//		return last_user;
//	}
//	public void setLast_user(String last_user) {
//		this.last_user = last_user;
//	}
//	public String getLast_ymd() {
//		return last_ymd;
//	}
//	public void setLast_ymd(String last_ymd) {
//		this.last_ymd = last_ymd;
//	}
//	public String getCar_apply_date() {
//		return car_apply_date;
//	}
//	public void setCar_apply_date(String car_apply_date) {
//		this.car_apply_date = car_apply_date;
//	}
//	public BigDecimal getCar_sale_prize() {
//		return car_sale_prize;
//	}
//	public void setCar_sale_prize(BigDecimal car_sale_prize) {
//		this.car_sale_prize = car_sale_prize;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPort_phone() {
//		return port_phone;
//	}
//	public void setPort_phone(String port_phone) {
//		this.port_phone = port_phone;
//	}
//	public String getVirtual_bank_no() {
//		return virtual_bank_no;
//	}
//	public void setVirtual_bank_no(String virtual_bank_no) {
//		this.virtual_bank_no = virtual_bank_no;
//	}
//	public String getCheck_no() {
//		return check_no;
//	}
//	public void setCheck_no(String check_no) {
//		this.check_no = check_no;
//	}
//	public BigDecimal getGift_unit() {
//		return gift_unit;
//	}
//	public void setGift_unit(BigDecimal gift_unit) {
//		this.gift_unit = gift_unit;
//	}
//	public String getMail_type() {
//		return mail_type;
//	}
//	public void setMail_type(String mail_type) {
//		this.mail_type = mail_type;
//	}
//	public String getTrust() {
//		return trust;
//	}
//	public void setTrust(String trust) {
//		this.trust = trust;
//	}
//	public String getVirtual_bank_no_t() {
//		return virtual_bank_no_t;
//	}
//	public void setVirtual_bank_no_t(String virtual_bank_no_t) {
//		this.virtual_bank_no_t = virtual_bank_no_t;
//	}
//	public String getCheck_no_t() {
//		return check_no_t;
//	}
//	public void setCheck_no_t(String check_no_t) {
//		this.check_no_t = check_no_t;
//	}
//	public String getVerno() {
//		return verno;
//	}
//	public void setVerno(String verno) {
//		this.verno = verno;
//	}
//	public String getContract() {
//		return contract;
//	}
//	public void setContract(String contract) {
//		this.contract = contract;
//	} 
//
}
