package com.api.springapi.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.springapi.enterprise.example.configuration.CurrencyServiceConfigurationProperties;

@RestController
public class CurrencyCOntroller {
	
	@Autowired
	private CurrencyServiceConfigurationProperties configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfigurationProperties getProperties() {
		return configuration;
	}
}
