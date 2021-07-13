package com.fg.dao.repository.sale;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;

@Repository
public interface Sale05M091Repository extends JpaRepository<Sale05m091Entity, String> {
  String sql1 = "select customName from sale05M091 where orderNo=:orderNo";

  //JPQL 
  List<Sale05m091Entity> findByOrderno(String orderno);

  //JPQL INT
  int countByOrderno(String orderno);
  
  //native查詢單、多個欄位，用OBJ[]回傳，一個Object[]表一個ROW，必須指定欄位名稱，不可使用*
  @Query(value = "select orderno from sale05M091 where orderNo=?1", nativeQuery = true)
  List<Object[]> getListByOrderNo(String orderNo);

  //native查詢，OBJ回傳，全部ROW視為一個OBJ，不可使用* (可使用變數)
  @Query(value = sql1, nativeQuery = true)
  List<Object> getListByOrderNo1(@Param("orderNo") String orderNo);

  //HQL查詢，回傳POJO，欄位必須一致
  @Query(value = "select t91 from Sale05m091Entity t91 where orderNo=:orderNo")
  List<Sale05m091Entity> getListByOrderNo2(@Param("orderNo") String orderNo);

  //native查詢，POJO輸出，欄位必須一致
  @Query(value = "select top 1 * from Sale05M091 where orderNo=:orderNo ", nativeQuery = true)
  List<Sale05m091Entity> getListByOrderNo3(@Param("orderNo") String orderNo);
  
  //native查詢，map輸出，可自由選擇欄位
  @Query(value = "select orderno , customno , customname  from Sale05M091 where orderNo=:orderNo ", nativeQuery = true)
  List<Map<String, Object>> getListByOrderNo4(@Param("orderNo") String orderNo);
  
}




