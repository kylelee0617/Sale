package com.fg.service.api.test;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fg.dao.entity.sale.Sale05m091Entity;
import com.fg.dao.entity.sale.Sale05m091EntityTest1;
import com.fg.dao.entity.sale.T91TestEntity;
import com.fg.dao.repository.sale.Sale05M091NativeRepo;
import com.fg.dao.repository.sale.Sale05M091Repository;
import com.fg.dao.repository.sale.Sale05M091Repository2;
import com.fg.dao.repository.sale.T91TestRepo;
import com.fg.dao.utils.JPAUtil;
import com.fg.service.BaseService;
import com.fg.service.vo.Result;

@Service
public class TestApiService extends BaseService {

  @Autowired
  private Sale05M091Repository saleT091Repo;
  @Autowired
  private Sale05M091Repository2 saleT091Repo2;

  @Autowired
  private T91TestRepo sale091Nav;
  
  @Autowired
  private Sale05M091NativeRepo sale091Nav2;


  public Result getSale05m091Repo1(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.findByOrderno(orderNo);
    rs.setData(list);
    return rs;
  }


  public Result getSale05m091Repo12(String orderNo) {
    Result rs = new Result();
    int aaa = saleT091Repo.countByOrderno(orderNo);
    rs.setData(aaa);
    return rs;
  }

  
  public Result getSale05m091Repo13(String orderNo) {
    Result rs = new Result();
    List<Object[]> list = saleT091Repo.getListByOrderNo13(orderNo);
    rs.setData(list);
    return rs;
  }

  
  public Result getSale05m091Repo14(String orderNo) {
    Result rs = new Result();
    List<Object> list = saleT091Repo.getListByOrderNo14(orderNo);
    rs.setData(list);
    return rs;
  }


  public Result getSale05m091Repo15(String orderNo) {
    Result rs = new Result();
    List<T91TestEntity> list = sale091Nav.getByEntIdAndRoleIds(orderNo);
    rs.setData(list);
    return rs;
  }

  public Result getSale05m091Repo16(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.getListByOrderNo2(orderNo);
    rs.setData(list);
    return rs;
  }


  public Result getSale05m091Repo17(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.getListByOrderNo17(orderNo);
    rs.setData(list);
    return rs;
  }
  

  public Result getSale05m091Repo171(String orderNo) {
    Result rs = new Result();
    List<Map<String, Object>> list = saleT091Repo.getListByOrderNo171(orderNo);
    rs.setData(list);
    return rs;
  }
  

  public Result getSale05m091Repo172(String orderNo) {
    Result rs = new Result();
    List<Sale05m091EntityTest1> list = saleT091Repo2.getListByOrderNo172(orderNo);
    rs.setData(list);
    return rs;
  }


  public Result getSale05m091Repo18(String orderNo) {
    Result rs = new Result();
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction etx = entityManager.getTransaction();
    etx.begin();
    Query q = entityManager.createNativeQuery("select top 5 customName from Sale05M091");
    q.getResultList();
    
    etx.commit();
    entityManager.close();        

    return rs;
  }
  
  
  public Result getSale05m091Repo19(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = sale091Nav2.getT91Test123(orderNo);
    rs.setData(list);
    return rs;
  }
  
}