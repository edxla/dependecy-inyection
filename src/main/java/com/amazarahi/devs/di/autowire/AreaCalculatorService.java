/**
 * 
 */
package com.amazarahi.devs.di.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Amazarashi
 *
 */
@Service
public class AreaCalculatorService {
	//list de Figura que sera inyectada con Autowired
	@Autowired
	private List<Figure> figures;
	public double calcAreas() 
	{
		double area=0.0;
		for (Figure figure : figures) {
			area+=figure.calculateArea();
		}
		return area;
	}

}
