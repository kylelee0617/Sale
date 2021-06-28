package com.fg.dao.repository.sale;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fg.dao.entity.sale.T91TestEntity;

@Repository
@Transactional
public class T91TestRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public List<T91TestEntity> getByEntIdAndRoleIds(String orderNo) {
        List<T91TestEntity> result = entityManager
                .createNamedQuery("queryByEntIdAndRoleIdsT91test")
                .setParameter("orderNo", orderNo)
                .getResultList();

        return result;
    }

}