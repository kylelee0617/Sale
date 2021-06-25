package com.fg.dao.repository.fe5d;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fg.dao.entity.fe5d.FE5D03Entity;

@Repository
public interface FE5D03Repo extends JpaRepository<FE5D03Entity, String> {
  
  //FE5D03Entity findByDEPT_CDAndDEPT_CD_1(String DEPT_CD, String DEPT_CD_1);

}
