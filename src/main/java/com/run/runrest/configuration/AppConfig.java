package com.run.runrest.configuration;

import javax.sql.DataSource;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppConfig {

	private Logger log = LoggerFactory.getLogger(AppConfig.class);
	
	@Autowired
	private AppProperties appProperties;

	@Autowired
	private AppProperties teste;
	
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
//	@Bean
//	public DataSource dataSource() {		
//		HikariDataSource dataSource = new HikariDataSource();
//		
//		log.info("Configurando Hikari com as propriedades {}, {}, {}", 
//				appProperties.getDataSourceUrl(), 
//				appProperties.getDataSourceDriverClassname(), 
//				appProperties.getDataSourceUsername());
//		
//		dataSource.setJdbcUrl(appProperties.getDataSourceUrl());
//		dataSource.setDriverClassName(appProperties.getDataSourceDriverClassname());		
//		dataSource.setUsername(appProperties.getDataSourceUsername());
//		dataSource.setPassword(appProperties.getDataSourcePassword());
//				
//		return null;
//	}

}