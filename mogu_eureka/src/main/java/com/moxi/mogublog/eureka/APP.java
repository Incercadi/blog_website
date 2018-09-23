package com.moxi.mogublog.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class APP {
  public static void main(String[] args) {
    SpringApplication.run(APP.class, args);
  }
}