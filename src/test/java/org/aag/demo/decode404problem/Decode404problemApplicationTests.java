package org.aag.demo.decode404problem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.aag.demo.decode404problem.clients.FirstFeignClient;
import org.aag.demo.decode404problem.clients.SecondFeignClient;
import org.aag.demo.decode404problem.clients.ThirdFeignClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.FeignClientFactoryBean;
import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.test.context.ContextConfiguration;

import feign.Feign;
import feign.FeignException;
import feign.ReflectiveFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Decode404problemApplicationTests {

  @Autowired private FirstFeignClient firstFeignClient;
  @Autowired private SecondFeignClient secondFeignClient;
  @Autowired private ThirdFeignClient thirdFeignClient;

  @Test
  void contextLoads() {

    try {
      firstFeignClient.getNonExistentContent();
    } catch (Exception e) {
      log.info(e.getMessage());
    }
    try {
      secondFeignClient.getNonExistentContent();
    } catch (Exception e) {
      log.info("This message will not be logged:" + e.getMessage());
    }
    try {
      thirdFeignClient.getNonExistentContent();
    } catch (Exception e) {
      log.info("This message will not be logged:" + e.getMessage());
    }
  }
}
