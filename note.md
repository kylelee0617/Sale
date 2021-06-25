#spring.datasource.type=com.zaxxer.hikari.HikariDataSource
#spring.datasource.hikari.minimum-idle=10
#spring.datasource.hikari.maximum-pool-size=25
##spring.datasource.hikari.auto-commit=true
##spring.datasource.hikari.idle-timeout=30000
#spring.datasource.hikari.pool-name=ExpendHikariCP
#spring.datasource.hikari.max-lifetime=1800000
#spring.datasource.hikari.connection-timeout=30000
#spring.datasource.hikari.connection-test-query=SELECT 1

# 下面為連線池的補充設定，應用到上面所有資料來源中
#自動提交
spring.datasource.default-auto-commit=true
#指定updates是否自動提交
spring.datasource.auto-commit=true
spring.jpa.show-sql = true
spring.datasource.maximum-pool-size=100
spring.datasource.max-idle=10
spring.datasource.max-wait=10000
spring.datasource.min-idle=5
spring.datasource.initial-size=5
spring.datasource.validation-query=SELECT 1
spring.datasource.test-on-borrow=false
spring.datasource.test-while-idle=true
# 配置間隔多久才進行一次檢測，檢測需要關閉的空閒連線，單位是毫秒 
spring.datasource.time-between-eviction-runs-millis=18800
# 配置一個連線在池中最小生存的時間，單位是毫秒 
spring.datasource.minEvictableIdleTimeMillis=300000

# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto=update  
#spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect  
spring.jpa.hibernate.naming_strategy=org.hibernate.cfg.ImprovedNamingStrategy  
#spring.jpa.database=org.hibernate.dialect.MySQL5InnoDBDialect 
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect


#spring:
#  datasource:
#    driver-class-name: 'com.microsoft.sqlserver.jdbc.SQLServerDriver'
#    url: 'jdbc:sqlserver://localhost;databaseName=kandawaps'
#    username: 'kanda'
#    password: 'kanda1723'
#  jpa: 
#    show-sql: true
#    properties: 
#      hibernate:
#       format_sql: true
#       dialect: 'org.hibernate.dialect.SQLServer2012Dialect'
#       ddl-auto: 'update'
##關閉 Thymeleaf 的快取開發過程中無需重啟
#spring.thymeleaf.cache = false
##設定thymeleaf頁面的編碼
#spring.thymeleaf.encoding=UTF-8
#spring.thymeleaf.mode=HTML5
##設定thymeleaf頁面的字尾
#spring.thymeleaf.suffix=.html
##設定thymeleaf頁面的儲存路徑
#spring.thymeleaf.prefix=classpath:/templates/

#server.port=8080 
#server.session.timeout=10 
#server.tomcat.uri-encoding=UTF-8 
#spring.thymeleaf.prefix=classpath:/views/ 
#spring.thymeleaf.suffix=.html 
#spring.thymeleaf.mode=HTML5 
#spring.thymeleaf.encoding=UTF-8 
#spring.thymeleaf.content-type=text/html 
#spring.thymeleaf.cache=false 