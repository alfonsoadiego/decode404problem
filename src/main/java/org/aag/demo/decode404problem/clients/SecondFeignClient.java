package org.aag.demo.decode404problem.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="http://localhost:8080", decode404 = false)
public interface FirstFeignClient {

     
}
