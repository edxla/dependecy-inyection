/**
 * 
 */
package com.amazarahi.devs.di.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Amazarashi
 *
 */
@Component
@Aspect //Anotado con la notacio
@Order(1)
public class MyAspect {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);
	
	//interceptara al metodo TargetObj.hello
	//tipo de advice que requiero
	//* o void de retorono del que sea-- de la clase X-Requiero todos Metodo, no importa los paremtros que reciva # "execution(* com.amazarahi.devs.di.aop.TargetObject.*(..))")
	//@Before("execution(* com.amazarahi.devs.di.aop.TargetObject.hello(..))") //se ejecuta antes del joinPoin recibe un valor
	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joinPoint) 
	{
		log.info("Method name {}",joinPoint.getSignature().getName());
		log.info("Object type name {}",joinPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers  {}",joinPoint.getSignature().getModifiers());
		log.info("Is public {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
		log.info("Arguments {}",joinPoint.getArgs());
		log.info("Before advice");
	}

}
