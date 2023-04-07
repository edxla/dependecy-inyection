/**
 * 
 */
package com.amazarahi.devs.di.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 * @author Amazarashi
 *
 */
@Component
@Lazy //(false)either
public class BeanB { // se contrule completanete
	@SuppressWarnings("unused")
	@Autowired
	private BeanA bean;
	
	private static final Logger log = LoggerFactory.getLogger(BeanB.class);

	@PostConstruct
	public void init() 
	{
		log.info("init bean b");
	}

}
