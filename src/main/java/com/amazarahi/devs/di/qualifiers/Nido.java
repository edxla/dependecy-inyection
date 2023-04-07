/**
 * 
 */
package com.amazarahi.devs.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class Nido {
	
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);

	
	@Autowired
	//@Qualifier("pajarito")
	private Animal animal;
	
	public void imprimir() 
	{
		log.info("MI nido tiene al animal {} ", animal.getNombre());
	}

}
