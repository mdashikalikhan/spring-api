package com.api.springapi.enterprise.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY =
			"""
			 insert into course(id, name, author)
			 values(1, 'Boot', 'SELF');
			""";
	
	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}
}
