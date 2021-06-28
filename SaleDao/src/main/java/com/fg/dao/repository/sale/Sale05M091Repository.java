package com.fg.dao.repository.sale;

import java.util.List;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;

@Repository
public interface Sale05M091Repository extends JpaRepository<Sale05m091Entity, String> {
  String sql1 = "select customName from sale05M091 where orderNo=:orderNo";

  List<Sale05m091Entity> findByOrderno(String orderno);

  int countByOrderno(String orderno);

  
  @Query(value = "select orderno from sale05M091 where orderNo=?1", nativeQuery = true)
  List<Object[]> getListByOrderNo(String orderNo);

  @Query(value = sql1, nativeQuery = true)
  List<Object> getListByOrderNo1(@Param("orderNo") String orderNo);

  @Query(value = "select t91 from Sale05m091Entity t91 where orderNo=:orderNo")
  List<Sale05m091Entity> getListByOrderNo2(@Param("orderNo") String orderNo);

  @Query(value = "select customName as customName from Sale05M091 where orderNo=:orderNo ", nativeQuery = true)
  List<Sale05m091Entity> getListByOrderNo3(@Param("orderNo") String orderNo);
  
  
  
}
