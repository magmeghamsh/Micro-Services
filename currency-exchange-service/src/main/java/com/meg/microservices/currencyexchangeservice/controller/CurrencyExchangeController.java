package com.meg.microservices.currencyexchangeservice.controller;

import com.meg.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.meg.microservices.currencyexchangeservice.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        return exchangeService.findByFromandTo(from, to);
    }
}
