/**
 * 
 */
package com.amazarahi.devs.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
//motor sera administrado por Spring
@Component
public class Motor {
	
	private String marca;
	
	private Integer modelo;
	

	public Motor() {
		// TODO Auto-generated constructor stub
	}

//	public Motor(String marca, Integer modelo) {
//		super();
//		this.marca = marca;
//		this.modelo = modelo;
//	}



	public String getMarca() {
		return marca;
	}
	@Value("XL1") 
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}
	@Value("1981")
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}



	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}  
	
	
	
	
	

}
