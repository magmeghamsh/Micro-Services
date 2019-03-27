package com.meg.microservices.currencyconversionservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.meg.microservices.currencyconversionservices")
@EnableDiscoveryClient
public class CurrencyConversionServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionServicesApplication.class, args);
    }

}
