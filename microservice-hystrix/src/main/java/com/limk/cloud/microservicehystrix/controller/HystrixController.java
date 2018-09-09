package com.limk.cloud.microservicehystrix.controller;

import com.limk.cloud.microservicehystrix.service.HystrixService;
import com.limk.cloud.microservicehystrix.service.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/ribbon/{id}")
    public UserDto findById(@PathVariable Long id) {
        return hystrixService.findById(id);
    }

}
