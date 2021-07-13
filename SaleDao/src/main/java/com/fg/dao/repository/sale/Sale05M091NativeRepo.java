package com.fg.dao.repository.sale;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.Sale05m091Entity;

@Repository
public interface Sale05M091NativeRepo extends CrudRepository<Sale05m091Entity, Long>, PagingAndSortingRepository<Sale05m091Entity, Long> {

  @Query(value = "select top 1 * from sale05M091 where orderNo=:orderNo", nativeQuery = true)
  List<Sale05m091Entity> getT91Test123(@Param("orderNo") String orderNo);

}
