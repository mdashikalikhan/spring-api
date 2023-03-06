package com.api.springapi.rest.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean filtering() {
		return new SomeBean("value1", "value2", "value3");
	}
	
	
	@GetMapping("/filtering-list")
	public List<SomeBean> filteringList() {
		return Arrays.asList( new SomeBean("value1", "value2", "value3"),
				new SomeBean("value4", "value5", "value6"));
	}
	
	@GetMapping("/filtering-dynamic")
	public MappingJacksonValue filteringDynamic() {
		SomeAnotherBean someAnotherBean = new SomeAnotherBean("value1", "value2", "value3");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someAnotherBean);
		
		/*
		 * SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter
		 * .filterOutAllExcept("field1"); FilterProvider fileterProvider = new
		 * SimpleFilterProvider().addFilter("SomeAnotherBeanFilter",
		 * simpleBeanPropertyFilter );
		 */
		
		
		
		mappingJacksonValue.setFilters(getFilter("field1"));
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list-dynamic")
	public MappingJacksonValue filteringListDynamic() {
		List<SomeAnotherBean> list = Arrays.asList( new SomeAnotherBean("value1", "value2", "value3"),
				new SomeAnotherBean("value4", "value5", "value6"));
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
		
		/*
		 * SimpleBeanPropertyFilter simpleBeanPropertyFilter= SimpleBeanPropertyFilter
		 * .filterOutAllExcept("field2","field3"); FilterProvider filterProvider = new
		 * SimpleFilterProvider().addFilter("SomeAnotherBeanFilter",
		 * simpleBeanPropertyFilter );
		 */
		mappingJacksonValue.setFilters(getFilter("field2","field3"));
		return mappingJacksonValue ;
	}
	
	private FilterProvider getFilter(String... fields) {
		SimpleBeanPropertyFilter simpleBeanPropertyFilter= SimpleBeanPropertyFilter
				.filterOutAllExcept(fields);
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeAnotherBeanFilter", 
				simpleBeanPropertyFilter );
		
		return filterProvider;
	}
	
	
}
