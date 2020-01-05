
package com.doug.mvc.application;
  
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
  
@SpringBootApplication
@EntityScan(basePackages = { "com.doug.mvc.entity" })
@EnableJpaRepositories(basePackages = { "com.doug.mvc.repository" })
@ComponentScan(basePackages = {"com.doug.mvc.controller"})
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer{
      public static void main(String[] args) {
    	  SpringApplication app = new SpringApplication(Application.class);
          app.setDefaultProperties(Collections
            .singletonMap("server.port", "8083"));
          app.run(args);
      }
}