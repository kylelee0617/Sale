package com.fg.dao.repository.fe5d;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class Fe5d05NativeRty {
  
  @PersistenceContext
  EntityManager em;
  
  public List<Object[]> getFe5D05tt(String orderNo){
    String sql = "select top 5 OBJECT_FULL_NAME from FE5D05";
    Query q = em.createNativeQuery(sql);
    return q.getResultList();
  }
  
}
