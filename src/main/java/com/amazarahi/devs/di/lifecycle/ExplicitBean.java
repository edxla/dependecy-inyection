/**
 * 
 */
package com.amazarahi.devs.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amazarashi
 *
 */
public class ExplicitBean {
	 
	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	
	public void init() 
	{
		log.info("Init Method");
	}
	
	public void destroy() 
	{
		log.info("Destry Method");
	}

}
