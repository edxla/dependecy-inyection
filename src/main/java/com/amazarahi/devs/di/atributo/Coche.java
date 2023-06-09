package com.amazarahi.devs.di.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Coche {
	
	// Notaciones
	
	private String marca;
	
	
	private Integer modelo;
	//inyeccion por atributo (obj)
	
	private Motor motor;
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	
//	public Coche(String marca,Integer modelo, Motor motor) {
//		super();
//		this.marca = marca;
//		this.modelo = modelo;
//		this.motor = motor;
//	}
	public String getMarca() {
		return marca;
	}
	@Value("VW") 
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
	public Motor getMotor() {
		return motor;
	}
	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}
	 
	
	
	
	

}
