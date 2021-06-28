package com.fg.dao.entity.sale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Sale05M091")
public class Sale05m091Entity2 {
  
  @Id
  @Column(name = "orderno")
  private String orderno;
  
  @Column(name = "recordno")
  private String recordno;
  
  @Column(name = "customno")
  private String customno;
  
  @Column(name = "customname")
  private String customname;
  
  @Column(name = "percentage")
  private int percentage;
  
  @Column(name = "zip")
  private String zip;
  
  @Column(name = "city")
  private String city;
  
  @Column(name = "town")
  private String town;
  
  @Column(name = "address")
  private String address;
  
  @Column(name = "cellphone")
  private String cellphone;
  
  @Column(name = "tel")
  private String tel;
  
  @Column(name = "tel2")
  private String tel2;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "auditorship")
  private String auditorship;
  
  @Column(name = "islinked")
  private String islinked;
  
  @Column(name = "iscontrollist")
  private String iscontrollist;
  
  @Column(name = "isblacklist")
  private String isblacklist;
  
  @Column(name = "trxdate")
  private String trxdate;
  
  @Column(name = "statuscd")
  private String statuscd;
  
  @Column(name = "nationality")
  private String nationality;
  
  @Column(name = "trxdatedown")
  private String trxdatedown;
  
  @Column(name = "positionname")
  private String positionname;
  
  @Column(name = "birthday")
  private String birthday;
  
  @Column(name = "majorname")
  private String majorname;
  
  @Column(name = "titlecd")
  private String titlecd;
  
  @Column(name = "countryname")
  private String countryname;
  
  @Column(name = "riskvalue")
  private String riskvalue;

  public String getOrderno() {
    return orderno;
  }

  public void setOrderno(String orderno) {
    this.orderno = orderno;
  }

  public String getRecordno() {
    return recordno;
  }

  public void setRecordno(String recordno) {
    this.recordno = recordno;
  }

  public String getCustomno() {
    return customno;
  }

  public void setCustomno(String customno) {
    this.customno = customno;
  }

  public String getCustomname() {
    return customname;
  }

  public void setCustomname(String customname) {
    this.customname = customname;
  }

  public int getPercentage() {
    return percentage;
  }

  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getTel2() {
    return tel2;
  }

  public void setTel2(String tel2) {
    this.tel2 = tel2;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAuditorship() {
    return auditorship;
  }

  public void setAuditorship(String auditorship) {
    this.auditorship = auditorship;
  }

  public String getIslinked() {
    return islinked;
  }

  public void setIslinked(String islinked) {
    this.islinked = islinked;
  }

  public String getIscontrollist() {
    return iscontrollist;
  }

  public void setIscontrollist(String iscontrollist) {
    this.iscontrollist = iscontrollist;
  }

  public String getIsblacklist() {
    return isblacklist;
  }

  public void setIsblacklist(String isblacklist) {
    this.isblacklist = isblacklist;
  }

  public String getTrxdate() {
    return trxdate;
  }

  public void setTrxdate(String trxdate) {
    this.trxdate = trxdate;
  }

  public String getStatuscd() {
    return statuscd;
  }

  public void setStatuscd(String statuscd) {
    this.statuscd = statuscd;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getTrxdatedown() {
    return trxdatedown;
  }

  public void setTrxdatedown(String trxdatedown) {
    this.trxdatedown = trxdatedown;
  }

  public String getPositionname() {
    return positionname;
  }

  public void setPositionname(String positionname) {
    this.positionname = positionname;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getMajorname() {
    return majorname;
  }

  public void setMajorname(String majorname) {
    this.majorname = majorname;
  }

  public String getTitlecd() {
    return titlecd;
  }

  public void setTitlecd(String titlecd) {
    this.titlecd = titlecd;
  }

  public String getCountryname() {
    return countryname;
  }

  public void setCountryname(String countryname) {
    this.countryname = countryname;
  }

  public String getRiskvalue() {
    return riskvalue;
  }

  public void setRiskvalue(String riskvalue) {
    this.riskvalue = riskvalue;
  }

}