package com.api.springapi.enterprise.example.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.springapi.enterprise.example.domain.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "1", "1"),
				new Course(2, "2", "2"),
				new Course(3, "3", "3"),
				new Course(4, "4", "4")
				);
	}
}
