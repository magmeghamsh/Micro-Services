package com.meg.microservices.currencyexchangeservice.service;

import com.meg.microservices.currencyexchangeservice.Repository.ExchangeRepository;
import com.meg.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExchangeService {

    @Autowired
    private ExchangeRepository exchangeRepository;

    public List<ExchangeValue> findAll() {
        return exchangeRepository.findAll();
    }

    public Optional<ExchangeValue> findOne(long key) {
        return exchangeRepository.findById(key);
    }

    public ExchangeValue findByFromandTo(String from, String to) {
        return exchangeRepository.findByFromAndTo(from, to);
    }
}
