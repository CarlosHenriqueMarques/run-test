package com.run.runrest.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppProperties {

	@Value("${spring.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.datasource.username}")
	private String dataSourceUsername;

	@Value("${spring.datasource.password}")
	private String dataSourcePassword;

	@Value("${spring.datasource.driver-class-name}")
	private String dataSourceDriverClassname;

}
