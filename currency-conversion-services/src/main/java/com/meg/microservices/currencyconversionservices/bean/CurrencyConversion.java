package com.meg.microservices.currencyconversionservices.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {

    Long id;
    String from;
    String to;
    BigDecimal quantity;
    BigDecimal conversionMultiple;
    BigDecimal totalCalculatedAmount;
}
