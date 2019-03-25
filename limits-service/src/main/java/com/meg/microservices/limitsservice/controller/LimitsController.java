package com.meg.microservices.limitsservice.controller;

import com.meg.microservices.limitsservice.bean.LimitConfiguration;
import com.meg.microservices.limitsservice.configuration.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    @GetMapping(path = "/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(applicationConfiguration.getMaximum(), applicationConfiguration.getMinimum());
    }
}
