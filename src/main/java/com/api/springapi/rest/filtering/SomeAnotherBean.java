package com.api.springapi.rest.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonFilter(value = "SomeAnotherBeanFilter")
@AllArgsConstructor
public class SomeAnotherBean {
	@Getter @Setter
	private String field1;
	@Getter @Setter
	private String field2;
	@Getter @Setter
	private String field3;
}
