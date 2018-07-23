package com.run.runrest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
//	 @Bean
//	    public HealthIndicator dbHealthIndicator() {
//	        return new HealthIndicator() {
//
//	            @Override
//	            public Health health() {
//	                return Health.status(Status.UP).withDetail("hello", "hi").build();
//	            }
//	        };
//	    }
	 
//	 @RestController
//	    public class HelloController {
//	        @GetMapping("/hello")
//	        public String hello() {
//	            return "hello";
//	        }
//	    }
}
