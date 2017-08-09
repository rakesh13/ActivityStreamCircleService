package com.stackroute.usercircle.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages={"com.stackroute.usercircle"})
@EntityScan(basePackages={"com.stackroute.usercircle"})
public class ActivityStreamUserCircleServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(ActivityStreamUserCircleServiceMain.class, args);

	}
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
