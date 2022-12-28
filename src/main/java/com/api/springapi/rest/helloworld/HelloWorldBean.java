package com.api.springapi.rest.helloworld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class HelloWorldBean {
	@Getter @Setter
	private String messge;
}
