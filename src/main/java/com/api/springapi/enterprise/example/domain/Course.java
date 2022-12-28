package com.api.springapi.enterprise.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Course {
	@Getter @Setter
	private long id;
	@Getter @Setter
	private String courseName;
	@Getter @Setter
	private String author;
}
