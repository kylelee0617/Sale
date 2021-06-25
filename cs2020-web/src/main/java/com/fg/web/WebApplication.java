package com.fg.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * exclude={DataSourceAutoConfiguration.class}  可在datasource沒配置的狀況下啟動
 * @author B04391
 *
 */

@SpringBootApplication(scanBasePackages = {"com.fg"}, exclude={DataSourceAutoConfiguration.class})
//@EntityScan(basePackages = {"com.fg.dao.entity"})
//@EnableJpaRepositories(basePackages = {"com.fg.dao.repository"})
@EnableTransactionManagement
public class WebApplication{

    public static void main(String[] args) {

        SpringApplication.run(WebApplication.class, args);

    }

}