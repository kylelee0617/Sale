package com.fg.service.api.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fg.dao.entity.sale.Sale05m091Entity;
import com.fg.dao.entity.sale.Sale05m091Entity2;
import com.fg.dao.entity.sale.T91TestEntity;
import com.fg.dao.repository.sale.Sale05M091Repository;
import com.fg.dao.repository.sale.T91TestRepo;
import com.fg.dao.utils.JPAUtil;
import com.fg.service.BaseService;
import com.fg.service.vo.Result;

@Service
public class TestApiService extends BaseService {

  @Autowired
  private Sale05M091Repository saleT091Repo;

  @Autowired
  private T91TestRepo sale091Nav;

  // 91 JPA
  public Result getSale05m091Repo1(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.findByOrderno(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA
  public Result getSale05m091Repo12(String orderNo) {
    Result rs = new Result();
    int aaa = saleT091Repo.countByOrderno(orderNo);
    rs.setData(aaa);
    return rs;
  }

  // 91 JPA NAV ?num
  public Result getSale05m091Repo13(String orderNo) {
    Result rs = new Result();
    List<Object[]> list = saleT091Repo.getListByOrderNo(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA NAV :name
  public Result getSale05m091Repo14(String orderNo) {
    Result rs = new Result();
    List<Object> list = saleT091Repo.getListByOrderNo1(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA NAV POJO
  public Result getSale05m091Repo15(String orderNo) {
    Result rs = new Result();
    List<T91TestEntity> list = sale091Nav.getByEntIdAndRoleIds(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA NAV POJO
  public Result getSale05m091Repo16(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.getListByOrderNo2(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA NAV POJO
  public Result getSale05m091Repo17(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.getListByOrderNo3(orderNo);
    rs.setData(list);
    return rs;
  }

  // 91 JPA NAV POJO
  public Result getSale05m091Repo18(String orderNo) {
    Result rs = new Result();
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction etx = entityManager.getTransaction();
    etx.begin();
    Query q = entityManager.createNativeQuery("select top 5 customName from Sale05M091");
    q.getResultList();
    
    etx.commit();
    entityManager.close();        

//    rs.setData(list);
    return rs;
  }

}