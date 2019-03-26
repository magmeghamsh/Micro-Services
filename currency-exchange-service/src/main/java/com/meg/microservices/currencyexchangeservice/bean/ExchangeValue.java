package com.meg.microservices.currencyexchangeservice.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExchangeValue {

    @Id
    @GeneratedValue
    Long id;

    @Column(name="currency_from")
    String from;

    @Column(name="currency_to")
    String to;

    BigDecimal conversionMultiple;

}
