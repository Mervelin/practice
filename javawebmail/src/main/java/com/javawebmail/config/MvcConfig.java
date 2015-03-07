package com.javawebmail.config;


import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	 public void addViewControllers(ViewControllerRegistry registry) {
		
        registry.addViewController("/login").setViewName("login");
		
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");

        registry.addViewController("/emailform").setViewName("emailform");
        registry.addViewController("/error").setViewName("error");
	}
	
/*	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public SimpleMappingExceptionResolver getException(){
		SimpleMappingExceptionResolver exception = new SimpleMappingExceptionResolver();
		Properties prop = new Properties();
		prop.setProperty("java.lang.Exception", "/error");
		exception.setExceptionMappings(prop);
		return exception;
	}*/
}
