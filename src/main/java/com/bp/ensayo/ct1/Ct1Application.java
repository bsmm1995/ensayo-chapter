package com.bp.ensayo.ct1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ct1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ct1Application.class, args);
    }

/*
    @Bean
    public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilter() {
        FilterRegistrationBean<RequestResponseLoggingFilter> registrationBean
                = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RequestResponseLoggingFilter());
        registrationBean.addUrlPatterns("/accounts/*");
        registrationBean.setOrder(2);
        return registrationBean;
    }*/
}
