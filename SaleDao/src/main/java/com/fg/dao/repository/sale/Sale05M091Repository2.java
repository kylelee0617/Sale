package com.fg.dao.repository.sale;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;
import com.fg.dao.entity.sale.Sale05m091EntityTest1;

@Repository
public interface Sale05M091Repository2 extends JpaRepository<Sale05m091EntityTest1, String> {
  
  //
  @Query(value = "select orderno , customno , customname  from Sale05M091 where orderNo=:orderNo ", nativeQuery = true)
  List<Sale05m091EntityTest1> getListByOrderNo172(@Param("orderNo") String orderNo);
  
}




