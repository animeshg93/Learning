package com.animesh.spring;

import com.animesh.spring.model.Paddle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
class SampleApplication {

  @Autowired static GenericApplicationContext context;

  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);

    System.out.println(context.getBean("paddle"));
  }

  @Bean
  //  @ConditionalOnBean(name = "raptor")
  public Paddle paddle() {
    Paddle pad = new Paddle();
    return pad;
  }
}
