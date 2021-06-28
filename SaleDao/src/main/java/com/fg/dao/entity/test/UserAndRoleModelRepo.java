package com.fg.dao.entity.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fg.dao.repository.test.UserAndRoleModel;

@Repository
@Transactional
public class UserAndRoleModelRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public List<UserAndRoleModel> getByEntIdAndRoleIds(Long entId, List<Long> roleIds) {
        List<UserAndRoleModel> result = entityManager
                .createNamedQuery("queryByEntIdAndRoleIds")
                .setParameter("entId", entId)
                .setParameter("roleIds", roleIds)
                .getResultList();

        //result.forEach(it -> System.out.println(it));

        return result;
    }

}