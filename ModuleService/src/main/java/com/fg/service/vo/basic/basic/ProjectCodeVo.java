package com.fg.service.vo.basic.basic;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.fg.service.vo.Result;

public class ProjectCodeVo {

	private Result result = null;// 登入結果

	private String DEPT_CD="1";
	private String DEPT_CD_1="1";
	private String DEPT_NAME="1";
	private String COMPANY_CD="1";
	private String COMPANY_CD_2="1";
	private String MAKE_DATE;
	private String MAKE_NO="1";
	private String START_DATE;
	private String DOOR_PLATE="1";
	private BigDecimal LAND_PERCENT;
	private BigDecimal PREFAB_PERCENT;
	private BigDecimal CAR_PREFAB_PERCENT;
	private BigDecimal CAR_LAND_PERCENT;
	private String CERTIFICATE_DATE;
	private String CERTIFICATE_NO="1";
	private int DOOR_SALE_NUM;
	private int DOOR_LAND_NUM;
	private int GARAGE_NUM;
	private BigDecimal MEND_PERCENT;
	private String BANK_TCD="1";
	private String BANK_CD="1";
	private String BANK_NO="1";
	private String BANK_NAME="1";
	private String BANK_KIND="1";
	private String BANK_TCD_2="1";
	private String BANK_CD_2="1";
	private String BANK_NO_2="1";
	private String BANK_NAME_2="1";
	private String BANK_KIND_2="1";
	private String BANK_DATE;
	private String MANAGE_CD="1";
	private BigDecimal MANAGE_NUM;
	private String DECORATE_CD="1";
	private BigDecimal DECORATE_NUM;
	private String FUND_CD="1";
	private BigDecimal FUND_NUM;
	private String DATE_TYPE="1";
	private String LAST_USER="1";
	private String LAST_YMD="1";
	private BigDecimal OVERDUE_PERCENT;
	private String ACCT_DEPT_CD="1";
	private String CASE_KIND="1";
	private String CLOSE_FLAG="1";
	private String ACCOUNT_KIND="1";
	private String VIRTUAL_BANK_NO_3="1";
	private BigDecimal MANAGE_UNIT;
	private String CLEAN_CD="1";
	private BigDecimal CLEAN_NUM;
	private String INVOICE_KIND="1";
	private String INVOICE_COMPANY_CD="1";
	private String INVOICE_KIND_2;
	private String INVOICE_COMPANY_CD_2;
	private int CAR_MANAGE_NUM;
	private String TRUST_DATE;
	private BigDecimal CAR2_MANAGE_NUM;

	private String TBANK_TCD;

	private String TBANK_CD;

	private String TBANK_NO;

	private String TBANK_NAME;

	private String TBANK_TCD_2;

	private String TBANK_CD_2;

	private String TBANK_NO_2;

	private String TBANK_NAME_2;

	private String TCOMPANY_CD;

	private String TCOMPANY_CD_2;

	private String OPEN_FLAG;

	private String VIRTUAL_BANK_NO_T;

	
	
	
	
	
	
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
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
		MAKE_DATE = mAKE_DATE.replace("/", "").replace("-", "").replace("2020", "109").substring(0,7);
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
		START_DATE = sTART_DATE.replace("/", "").replace("-", "").replace("2020", "109").substring(0,7);
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
		CERTIFICATE_DATE = cERTIFICATE_DATE.replace("/", "").replace("-", "").replace("2020", "109").substring(0,7);
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
		BANK_DATE = bANK_DATE.replace("/", "").replace("-", "").replace("2020", "109").substring(0,7);
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
		TRUST_DATE = tRUST_DATE.replace("/", "").replace("-", "").replace("2020", "109").substring(0,7);
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
	
}
