package org.zerotul.chaos.monkey.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public FilterRegistrationBean<CustomFilter> loggingResponseFilter() {
    FilterRegistrationBean<CustomFilter> registrationBean
        = new FilterRegistrationBean<>();
    registrationBean.setFilter(new CustomFilter());
    registrationBean.addUrlPatterns("*");
    return registrationBean;
  }

}
