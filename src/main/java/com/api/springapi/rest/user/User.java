package com.api.springapi.rest.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class User {
	@Getter @Setter 
	private Integer id;
	@Getter @Setter @Min(value = 2, message = "Name must be minimum 2 characters")
	private String name;
	@Getter @Setter @Past(message = "Birth date must be in past value")
	private LocalDate birthDate;
}
