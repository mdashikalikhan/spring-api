package com.api.springapi.rest.versioning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class PersonV1 {
	@Getter
	private String name;
}
