/**
 * 
 */
package com.amazarahi.devs.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Amazarashi
 *
 */
@Configuration
//
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguration {
	
	//Declaracion de forma explicitaa
	@Bean
	public PropertySourcesPlaceholderConfigurer loadProperties() 
	{
		return new PropertySourcesPlaceholderConfigurer();
	}

}
