package org.aag.demo.decode404problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Decode404problemApplication {

  public static void main(String[] args) {
    SpringApplication.run(Decode404problemApplication.class, args);
  }
}
