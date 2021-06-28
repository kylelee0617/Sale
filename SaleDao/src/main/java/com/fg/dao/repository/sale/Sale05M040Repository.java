package com.fg.dao.repository.sale;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;

@Repository
public interface Sale05M040Repository extends JpaRepository<Sale05m091Entity, String> {
  String sql1 = "select PingSu from Sale05M040 where ProjectID1 = ?1 and [Position] = ?2";
  
  /**
   * 查詢價目表坪數
   * 
   * @param orderNo
   * @return
   */
  @Query(value = sql1, nativeQuery = true)
  List<List> getListByOrderNo1(String projectId , String position);

}
