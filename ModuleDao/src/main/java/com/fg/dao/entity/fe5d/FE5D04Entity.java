package com.fg.dao.entity.fe5d;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "FE5D04")
public class FE5D04Entity {

  @Id
  @Column(name = "dept_cd")
  private String dept_cd;

  @Column(name = "dept_cd_1")
  private String dept_cd_1;

  @Column(name = "kind_cd")
  private String kind_cd;

  @Column(name = "order_no")
  private String order_no;

  @Column(name = "itemls_cd")
  private String itemls_cd;

  @Column(name = "amt_percent")
  private String amt_percent;

  @Column(name = "pay_amt")
  private String pay_amt;

  @Column(name = "pay_amt_2")
  private String pay_amt_2;

  @Column(name = "pay_amt_3")
  private String pay_amt_3;

  @Column(name = "pay_amt_4")
  private String pay_amt_4;

  @Column(name = "pay_date")
  private String pay_date;

  public String getDept_cd() {
    return dept_cd;
  }

  public void setDept_cd(String dept_cd) {
    this.dept_cd = dept_cd;
  }

  public String getDept_cd_1() {
    return dept_cd_1;
  }

  public void setDept_cd_1(String dept_cd_1) {
    this.dept_cd_1 = dept_cd_1;
  }

  public String getKind_cd() {
    return kind_cd;
  }

  public void setKind_cd(String kind_cd) {
    this.kind_cd = kind_cd;
  }

  public String getOrder_no() {
    return order_no;
  }

  public void setOrder_no(String order_no) {
    this.order_no = order_no;
  }

  public String getItemls_cd() {
    return itemls_cd;
  }

  public void setItemls_cd(String itemls_cd) {
    this.itemls_cd = itemls_cd;
  }

  public String getAmt_percent() {
    return amt_percent;
  }

  public void setAmt_percent(String amt_percent) {
    this.amt_percent = amt_percent;
  }

  public String getPay_amt() {
    return pay_amt;
  }

  public void setPay_amt(String pay_amt) {
    this.pay_amt = pay_amt;
  }

  public String getPay_amt_2() {
    return pay_amt_2;
  }

  public void setPay_amt_2(String pay_amt_2) {
    this.pay_amt_2 = pay_amt_2;
  }

  public String getPay_amt_3() {
    return pay_amt_3;
  }

  public void setPay_amt_3(String pay_amt_3) {
    this.pay_amt_3 = pay_amt_3;
  }

  public String getPay_amt_4() {
    return pay_amt_4;
  }

  public void setPay_amt_4(String pay_amt_4) {
    this.pay_amt_4 = pay_amt_4;
  }

  public String getPay_date() {
    return pay_date;
  }

  public void setPay_date(String pay_date) {
    this.pay_date = pay_date;
  }
  
}