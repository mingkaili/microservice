package com.limk.cloud.microserviceconsumerfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-provider-user")
public interface FeignService {

    @RequestMapping("/{id}")
    UserDto findByIdFeign(@RequestParam("id") Long id);
}
