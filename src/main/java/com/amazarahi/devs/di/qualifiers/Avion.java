/**
 * 
 */
package com.amazarahi.devs.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class Avion implements Volador{

	
	private static final Logger log = LoggerFactory.getLogger(Avion.class);

	@Override
	public void volar() {
		log.info("soy un avion y estoy volando");
		
	}

}
