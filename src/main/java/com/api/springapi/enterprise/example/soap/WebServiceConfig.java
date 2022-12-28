package com.api.springapi.enterprise.example.soap;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	
	
	
	/*@Bean
	public ServletRegistrationBeanMessageDispatcherServlet> dispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(messageDispatcherServlet, "/ws/*");
	}*/
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	}
	
	/*@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}*/
	 
	
	/*
	 * @Bean public ServletRegistrationBean dispatcherServletRegistration() {
	 * 
	 * ServletRegistrationBean registration = new
	 * ServletRegistrationBean(dispatcherServlets());
	 * registration.setLoadOnStartup(0);
	 * registration.setName(DispatcherServletAutoConfiguration.
	 * DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
	 * 
	 * return registration; }
	 * 
	 * @Bean public DispatcherServlet dispatcherServlets() { DispatcherServlet
	 * dispatcherServlet = new DispatcherServlet();
	 * dispatcherServlet.setThreadContextInheritable(true);
	 * dispatcherServlet.setThrowExceptionIfNoHandlerFound(true); return
	 * dispatcherServlet; }
	 */
	
	
	@Bean
	public XsdSchema courseSChema() {
		return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
	}
	
	@Bean(name = "course-details")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema courseSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("CoursePort");
		definition.setTargetNamespace("http://www.example.org/course-details");
		definition.setLocationUri("/ws");
		definition.setSchema(courseSchema);
		
		return definition;
	}
	
	
	
}
