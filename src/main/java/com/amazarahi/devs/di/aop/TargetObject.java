/**
 * 
 */
package com.amazarahi.devs.di.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class TargetObject {
	
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);
	
	//annontation
	@DevsAnnotation
	public void hello (String message) 
	{
		log.info(message);
	}
	
	public void foo () 
	{
		log.info("Foo");
	}

	
	
}
