package com.fg.dao.entity.sale;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

import lombok.Data;


@SqlResultSetMapping(
    name = "Sale05m091Entity2",
    classes = {@ConstructorResult(
        targetClass = Sale05m091Entity2.class,
        columns = {
          @ColumnResult(name = "customno", type = String.class),
          @ColumnResult(name = "customname", type = String.class),}
      )
    })
@Entity
@Data
public class Sale05m091Entity2 {

  @Id
  private String customno;
  
  private String customname;
  
}
