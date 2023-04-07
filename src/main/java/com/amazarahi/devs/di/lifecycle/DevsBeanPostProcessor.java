/**
 * 
 */
package com.amazarahi.devs.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
public class DevsBeanPostProcessor implements BeanPostProcessor {
	
	private static final Logger log = LoggerFactory.getLogger(DevsBeanPostProcessor.class);


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// Especifico solamente pra LifeCycleBean
		if(bean instanceof LifeCycleBean) 
		{
			log.info("Before Inicialization {} ", beanName);
			
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof LifeCycleBean) 
		{
			log.info("After Inicialization {} ", beanName);
		}
		return bean;
	}
	
	

}
