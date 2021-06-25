package com.fg.web.filter;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

/**
 * 1. 在元件產生方法中，使用「FilterRegistrationBean」的「setOrder」方法，可以設定執行順序。數字越低，代表能越先擷取請求，但越晚擷取回應。若不設定，順序預設為Filter名稱遞減。
 * 2. 讀者可自行設置哪些API才需要觸發Filter。透過「addUrlPatterns」或「setUrlPatterns」方法，能傳入路徑格式。「*」符號代表全部，例如上述是將Filter套用到全部的API。
 * @author B04391
 *
 */

@Configuration
public class FilterConfig {
  
  @Bean
  public Filter loginFilter() {
      return new LoginFilter();
  }
  
  @Bean
  public FilterRegistrationBean LogApiFilterFilter() {
    FilterRegistrationBean<LogApiFilter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new LogApiFilter());
    bean.addUrlPatterns("/*");
    bean.setName("logApiFilter");
    bean.setOrder(2);
    return bean;
  }
  
  @Bean
  public FilterRegistrationBean loginFilterRegistration() {
    FilterRegistrationBean bean = new FilterRegistrationBean<>();
    bean.setFilter(new DelegatingFilterProxy("loginFilter"));
    bean.addUrlPatterns("/page/*");
    bean.addUrlPatterns("/api/*");
    bean.setName("loginFilter");
    bean.setOrder(1);
    return bean;
  }

  @Bean
  public FilterRegistrationBean logProcessTimeFilter() {
    FilterRegistrationBean<LogProcessTimeFilter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new LogProcessTimeFilter());
    bean.addUrlPatterns("/*");
    bean.setName("logProcessTimeFilter");
    bean.setOrder(0);
    return bean;
  }

}