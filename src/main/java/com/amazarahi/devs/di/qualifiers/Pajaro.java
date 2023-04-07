/**
 * 
 */
package com.amazarahi.devs.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
//             ("pajarito")
@Component
//Por default al inyectar en animal inyectara un obj de tipo paaro
@Primary
public class Pajaro extends Animal implements Volador{
	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	public Pajaro(@Value("Pajaro Loco")String nombre,@Value("1") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void volar() {
		log.info("Soy un Pajaro y estoy volando");
		// TODO Auto-generated method stub
		
	}

}
