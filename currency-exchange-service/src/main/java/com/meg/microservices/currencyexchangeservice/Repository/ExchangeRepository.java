package com.meg.microservices.currencyexchangeservice.Repository;

import com.meg.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeValue, Integer> {

    ExchangeValue findByFromAndTo(String from, String to);
}
