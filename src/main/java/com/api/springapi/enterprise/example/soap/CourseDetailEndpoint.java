package com.api.springapi.enterprise.example.soap;



import javax.xml.bind.JAXBElement;

import org.example.course_details.CourseDetails;
import org.example.course_details.GetCourseDetailRequest;
import org.example.course_details.GetCourseDetailResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class CourseDetailEndpoint {
	
	@PayloadRoot(namespace = "http://www.example.org/course-details", localPart = "GetCourseDetailRequest")
	@ResponsePayload
	public GetCourseDetailResponse  process(@RequestPayload GetCourseDetailRequest request) {
		GetCourseDetailResponse response = new GetCourseDetailResponse();
		
		System.out.println("Request comes here: " + request);
		
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(100);
		courseDetails.setName("SOAP COURSE");
		courseDetails.setDescription("DESCRIPTION");
		response.setCouseDetails(courseDetails);
		
		
		
		return response;
	}
	
	
}
