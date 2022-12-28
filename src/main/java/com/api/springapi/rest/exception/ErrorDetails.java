package com.api.springapi.rest.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ErrorDetails {
	@Getter
	private LocalDateTime timestamp;
	@Getter
	private String mesage;
	@Getter
	private String description;
}
