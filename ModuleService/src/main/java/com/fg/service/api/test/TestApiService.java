package com.fg.service.api.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fg.dao.entity.sale.Sale05m091Entity;
import com.fg.dao.repository.fe5d.Fe5d05NativeRty;
import com.fg.dao.repository.sale.Sale05m091Repository;
import com.fg.dao.repository.sale.Sale5m091NativeRty;
import com.fg.service.BaseService;
import com.fg.service.vo.Result;


@Service
public class TestApiService extends BaseService {

  @Autowired
  private Sale05m091Repository saleT091Repo;
  
  @Autowired
  private Fe5d05NativeRty fe5d05NavRty;
  
  @Autowired
  Sale5m091NativeRty t091NatRty;
  
  
  public Result getSale05m091Repo(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = saleT091Repo.findByOrderno(orderNo);
    rs.setData(list);
    return rs;
  }
  
  public Result getSale05m091Repo2(String orderNo) {
    Result rs = new Result();
    int aaa = saleT091Repo.countByOrderno(orderNo);
    rs.setData(aaa);
    return rs;
  }
  
  public Result getSale05m091Repo3(String orderNo) {
    Result rs = new Result();
    List<Object[]> list = fe5d05NavRty.getFe5D05tt(orderNo);
    rs.setData(list);
    return rs;
  }
  
  public Result getSale05m091Repo4(String orderNo) {
    Result rs = new Result();
    List<List> list = saleT091Repo.getListByOrderNo(orderNo);
    rs.setData(list);
    return rs;
  }
  
  public Result getSale05m091Repo5(String orderNo) {
    Result rs = new Result();
    List<Sale05m091Entity> list = t091NatRty.getT091tt(orderNo);
    rs.setData(list);
    return rs;
  }
  
}