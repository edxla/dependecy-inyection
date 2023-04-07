package com.amazarahi.devs.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope("prototype")//no ejecuta con beans protorype
//@Lazy // si el bean es lazy no se inicializara a menos que se inyecte
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	/**
	 * Se Ejecuta durante la construccion del Bean ""BEANNAMEAWRE
	 * */
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		log.info("Bean Name {}",name);
	}
	//no se puede recibir parametros
	/**
	 * Se ejecutara despues de la inyeccion de dependecias
	 * 
	 * */
	
	@PostConstruct
	public void init() 
	{
		log.info("Post COntrusct");
	}
	/**
	 * Se ejecutara antes de que el bean sea destruido
	 * No se ejecutan para beans Pretotype
	 * solo se ejecutan durante ua terminacion de la VM de forma normal
	 * 
	 * */
	@PreDestroy
	public void destroyBean() 
	{
		log.info("Pre Destroy");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("after Properties Set Method");
		
	}
	@Override
	public void destroy() throws Exception {
		log.info("Set Properties Set Method");
		
	}
	

}
