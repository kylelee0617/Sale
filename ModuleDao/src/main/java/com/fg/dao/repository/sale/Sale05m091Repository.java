package com.fg.dao.repository.sale;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;

@Repository
public interface Sale05m091Repository extends JpaRepository<Sale05m091Entity, String> {
  String sql1 = "select * from sale05M091 where orderNo=?1";

  List<Sale05m091Entity> findByOrderno(String orderno);

  int countByOrderno(String orderno);

  @Query(value = "select * from sale05M091 where orderNo=?1", nativeQuery = true)
  List<List> getListByOrderNo(String orderNo);

  @Query(value = sql1, nativeQuery = true)
  List<List> getListByOrderNo1(String orderNo);

}
