/**
 * 
 */
package com.amazarahi.devs.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class Circle implements Figure {
	//@Value("2.5") el : por si no existe la propiedad pone 0
	@Value("${circle.radius:0}")
	private double radius;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

}
