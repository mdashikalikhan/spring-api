package com.api.springapi.rest.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class SomeBean {
	@Getter @Setter
	private String field1;
	@Getter @Setter
	@JsonIgnore
	private String field2;
	@Getter @Setter
	private String field3;
}
