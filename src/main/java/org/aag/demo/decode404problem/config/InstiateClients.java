package org.aag.demo.decode404problem.config;

import org.aag.demo.decode404problem.clients.FirstFeignClient;
import org.aag.demo.decode404problem.clients.SecondFeignClient;
import org.aag.demo.decode404problem.clients.ThirdFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.hystrix.HystrixFeign;
import lombok.RequiredArgsConstructor;

@Configuration
public class InstiateClients {
  @Bean
  Feign.Builder feignClient() {
    return HystrixFeign.builder();
  }
}
