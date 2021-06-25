package com.fg.dao.DataSourceConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 設定連接多資料庫
 * @author B04391
 *
 */

@Configuration
public class DataSourcesConfig {
  @Bean(name = "primaryDataSource")
  @Qualifier("primaryDataSource")
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource.primary")
  public DataSource primaryDataSource() {
    System.out.println("primary db built");
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "secondaryDataSource")
  @Qualifier("secondaryDataSource")
  @ConfigurationProperties(prefix = "spring.datasource.secondary")
  public DataSource secondaryDataSource() {
    System.out.println("secondary db built");
    return DataSourceBuilder.create().build();
  }
}
