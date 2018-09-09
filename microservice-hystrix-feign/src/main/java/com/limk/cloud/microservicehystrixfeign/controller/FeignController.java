package com.limk.cloud.microservicehystrixfeign.controller;

import com.limk.cloud.microservicehystrixfeign.service.FeignService;
import com.limk.cloud.microservicehystrixfeign.service.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("feign/{id}")
    public UserDto findByIdFeign(@PathVariable Long id) {
        UserDto user = feignService.findByIdFeign(id);
        return user;
    }

}
