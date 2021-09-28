package com.fg.dao.entity.sale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Sale05M091")
public class Sale05m091EntityTest1 {
  
  @Id
  @Column(name = "orderno")
  private String orderNo;
  
  @Column(name = "customno")
  private String customNo;
  
  @Column(name = "customname")
  private String customName;

  
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getCustomNo() {
    return customNo;
  }

  public void setCustomNo(String customNo) {
    this.customNo = customNo;
  }

  public String getCustomName() {
    return customName;
  }

  public void setCustomName(String customName) {
    this.customName = customName;
  }
  
}