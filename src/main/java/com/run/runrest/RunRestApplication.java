package com.run.runrest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import com.run.runrest.constants.Constants;

@SpringBootApplication
public class RunRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunRestApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath(Constants.SERVICE_PREFIX);
	}
}
