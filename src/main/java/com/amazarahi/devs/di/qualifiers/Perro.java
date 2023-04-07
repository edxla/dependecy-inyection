/**
 * 
 */
package com.amazarahi.devs.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class Perro extends Animal{

	public Perro(@Value("Rocky") String nombre, @Value("1")Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

}
