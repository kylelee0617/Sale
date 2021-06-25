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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "entityManagerFactorySecondary", 
    transactionManagerRef = "transactionManagerSecondary", 
    basePackages = {"com.fg.dao.repository.sale" }) // 设置Repository所在位置
public class SecondaryConfig {

  @Autowired
  private JpaProperties jpaProperties;
  
  @Autowired
  private HibernateProperties hibernateProperties;

  @Autowired
  @Qualifier("secondaryDataSource")
  private DataSource secondaryDataSource;

  @Bean(name = "entityManagerSecondary")
  public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
    return entityManagerFactorySecondary(builder).getObject().createEntityManager();
  }

  @Bean(name = "entityManagerFactorySecondary")
  public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary(EntityManagerFactoryBuilder builder) {
    Map<String, Object> properties = hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
    return builder.dataSource(secondaryDataSource)
                  .properties(properties)
                  .packages("com.fg.dao.entity.sale") // 设置实体类所在位置
                  .persistenceUnit("secondaryPersistenceUnit").build();
  }

  @Bean(name = "transactionManagerSecondary")
  PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
    return new JpaTransactionManager(entityManagerFactorySecondary(builder).getObject());
  }

}