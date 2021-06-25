package com.fg.dao.repository.sale;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;
import com.fg.dao.utils.MsSaleUtil;

@Repository
public class Sale5m091NativeRty {
  
  
  public List<Sale05m091Entity> getT091tt(String orderNo){
    String sql = "select top 5 * from sale05m091";
    Query q = MsSaleUtil.getEntityManager().createNativeQuery(sql, Sale05m091Entity.class);
    return q.getResultList();
  }
  
}
