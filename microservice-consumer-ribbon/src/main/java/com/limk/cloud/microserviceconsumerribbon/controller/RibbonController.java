package com.limk.cloud.microserviceconsumerribbon.controller;

import com.limk.cloud.microserviceconsumerribbon.service.RibbonService;
import com.limk.cloud.microserviceconsumerribbon.service.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public UserDto findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }

}
