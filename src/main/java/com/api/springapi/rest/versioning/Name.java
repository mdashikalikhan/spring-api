package com.api.springapi.rest.versioning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Name {
	@Getter
	private String firstName;
	@Getter
	private String lastName;
}
