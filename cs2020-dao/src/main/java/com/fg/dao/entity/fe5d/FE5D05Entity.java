package com.fg.dao.entity.fe5d;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "FE5D05")
public class FE5D05Entity {
  
  @Id
  @Column(name = "dept_cd")
  private String deptcd;
  
  @Column(name = "dept_cd_1")
  private String deptcd1;
  
  @Column(name = "object_cd")
  private String objectcd;
  
  @Column(name = "object_cd_work")
  private String objectcdwork;
  
  @Column(name = "object_short_name")
  private String objectshortname;
  
  @Column(name = "object_full_name")
  private String objectfullname;
  
  @Column(name = "object_eng_name")
  private String objectengname;
  
  @Column(name = "object_type")
  private String objecttype;
  
  @Column(name = "door_plate")
  private String doorplate;
  
  @Column(name = "object_id")
  private String objectid;

  public String getDeptcd() {
    return deptcd;
  }

  public void setDeptcd(String deptcd) {
    this.deptcd = deptcd;
  }

  public String getDeptcd1() {
    return deptcd1;
  }

  public void setDeptcd1(String deptcd1) {
    this.deptcd1 = deptcd1;
  }

  public String getObjectcd() {
    return objectcd;
  }

  public void setObjectcd(String objectcd) {
    this.objectcd = objectcd;
  }

  public String getObjectcdwork() {
    return objectcdwork;
  }

  public void setObjectcdwork(String objectcdwork) {
    this.objectcdwork = objectcdwork;
  }

  public String getObjectshortname() {
    return objectshortname;
  }

  public void setObjectshortname(String objectshortname) {
    this.objectshortname = objectshortname;
  }

  public String getObjectfullname() {
    return objectfullname;
  }

  public void setObjectfullname(String objectfullname) {
    this.objectfullname = objectfullname;
  }

  public String getObjectengname() {
    return objectengname;
  }

  public void setObjectengname(String objectengname) {
    this.objectengname = objectengname;
  }

  public String getObjecttype() {
    return objecttype;
  }

  public void setObjecttype(String objecttype) {
    this.objecttype = objecttype;
  }

  public String getDoorplate() {
    return doorplate;
  }

  public void setDoorplate(String doorplate) {
    this.doorplate = doorplate;
  }

  public String getObjectid() {
    return objectid;
  }

  public void setObjectid(String objectid) {
    this.objectid = objectid;
  }
  
}