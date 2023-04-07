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
public class Square implements Figure {
	//@Value("2.5")
	@Value("${square.size:0}")
	
	private double side;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
