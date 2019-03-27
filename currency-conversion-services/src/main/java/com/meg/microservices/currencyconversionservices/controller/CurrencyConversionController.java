package com.meg.microservices.currencyconversionservices.controller;

import com.meg.microservices.currencyconversionservices.bean.CurrencyConversion;
import com.meg.microservices.currencyconversionservices.service.CurrencyExchangeServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
                                              @PathVariable BigDecimal quantity) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CurrencyConversion> responseBody = new RestTemplate()
                .getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}"
                        , CurrencyConversion.class, uriVariables);
        CurrencyConversion response = responseBody.getBody();
        return new CurrencyConversion(response.getId(), from, to, quantity, response.getConversionMultiple(),
                quantity.multiply(response.getConversionMultiple()));
    }

    @GetMapping("currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion retrieveExchange(@PathVariable String from, @PathVariable String to,
                                              @PathVariable BigDecimal quantity) {

        CurrencyConversion response = currencyExchangeServiceProxy.retrieveExchange(from, to);
        return new CurrencyConversion(response.getId(), from, to, quantity, response.getConversionMultiple(),
                quantity.multiply(response.getConversionMultiple()));
    }
}
