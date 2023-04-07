/**
 * 
 */
package com.amazarahi.devs.di.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Amazarashi
 *
 */
public class PointcutExample {
	
	//@Pointcut("execution(* com.amazarahi.devs.di.aop.TargetObject.*(..))")
	//@Pointcut("within( TargetObject)")
	@Pointcut("@annotation(DevsAnnotation)")
	public void targetObjectMethods() 
	{
		
	}

}
