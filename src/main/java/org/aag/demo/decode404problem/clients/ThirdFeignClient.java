package org.aag.demo.decode404problem.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="http://localhost:8081", decode404 = true)
public interface SecondFeignClient {

     
}
