package com.api.springapi.enterprise.example.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfigurationProperties {
	@Getter @Setter private String url;
	@Getter @Setter private String user;
	@Getter @Setter private String key;
}
