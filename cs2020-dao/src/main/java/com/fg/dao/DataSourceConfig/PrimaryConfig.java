package com.fg.dao.DataSourceConfig;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 設定主資料庫連接
 * @author B04391
 *
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "entityManagerFactoryPrimary", 
    transactionManagerRef = "transactionManagerPrimary", 
    basePackages = {"com.fg.dao.repository.fe5d" }) // 设置Repository所在位置
public class PrimaryConfig {

  @Autowired
  @Qualifier("primaryDataSource")
  private DataSource primaryDataSource;
  
  @Autowired(required = false)
  private JpaProperties jpaProperties;

  @Autowired
  private HibernateProperties hibernateProperties;

  @Primary
  @Bean(name = "entityManagerPrimary")
  public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
    return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
  }

  @Primary
  @Bean(name = "entityManagerFactoryPrimary")
  public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
    Map<String, Object> properties = hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
    return builder.dataSource(primaryDataSource)
                  .properties(properties)
                  .packages("com.fg.dao.entity.fe5d") // 设置实体类所在位置
                  .persistenceUnit("primaryPersistenceUnit").build();
  }

  @Primary
  @Bean(name = "transactionManagerPrimary")
  public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
    return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
  }

}
