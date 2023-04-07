/**
 * 
 */
package com.amazarahi.devs.di.aop;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
/**
 * @author Amazarashi
 *
 */
public @interface DevsAnnotation {

}
