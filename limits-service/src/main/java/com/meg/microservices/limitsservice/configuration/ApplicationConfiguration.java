package com.meg.microservices.limitsservice.configuration;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="limits-service")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ApplicationConfiguration {

    int maximum;
    int minimum;
}
