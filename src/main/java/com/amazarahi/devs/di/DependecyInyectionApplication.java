package com.amazarahi.devs.di;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amazarahi.devs.di.aop.TargetObject;

import ch.qos.logback.core.pattern.parser.Parser;
//notaciones que juntas funcionan igual a SpringBootApliction
//
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
//

@SuppressWarnings("unused")
@SpringBootApplication
public class DependecyInyectionApplication {
	
	//Declaracion de beans de manera explicita, se registra en contexto de String
//	@Bean
//	public String getApplicationName() 
//	{
//		return "Devs rules";
//	}
//
//	private static final org.slf4j.Logger log = LoggerFactory.getLogger(DependecyInyectionApplication.class);

	//Declaracion Explicita
	//Metodo Pre COntstru y Post Destroy
//	@Bean(initMethod = "init", destroyMethod = "destroy")
//	public ExplicitBean getBean() 
//	{
//		return new ExplicitBean();
//		
//	} 
	
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInyectionApplication.class, args);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hellow World");
		targetObject.foo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//LifeCycleBean bean = context.getBean(LifeCycleBean.class);
		
		
		//SPEL expression
//		ExpressionParser parser = new SpelExpressionParser();
//		org.springframework.expression.Expression parseExpression = parser.parseExpression("30>12");
//		log.info("String expression {}", parseExpression.getValue());
//		
		
		//Carha Propiedades
//		ConfigurableApplicationContext context = SpringApplication.run(DependecyInyectionApplication.class, args);
//		
//		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
//		log.info("Area total {} : ", calculator.calcAreas());
//		
		
		
//	Beans Forma Explicita	
//		String nombreAplicacion = context.getBean(String.class);
//		log.info("Nombre de la Aplicacion {} ",nombreAplicacion);
//		
		
		
		//Spring Scopes
//		EjemploScopeService ejemploScopes = context.getBean(EjemploScopeService.class);
//		EjemploScopeService ejemploScopes1 = context.getBean(EjemploScopeService.class);
//		log.info("Are beans equals {}", ejemploScopes.equals(ejemploScopes1));
//		log.info("Are beans == {}", ejemploScopes == ejemploScopes1);


		
		//utilizando Perfiles
//		EnvironmentService environmentService = context.getBean(EnvironmentService.class);
//		log.info("Active Enviroment {} ", environmentService.getEnvironment());
//		
		
		//Ejemplos ateriores
		//lugar donde viven los objetos = contx el retorno son contx
//		Coche coche = context.getBean(Coche.class);
//		System.out.println(coche);
		//contecto impirmir el metodo que recive [Cuando tipo de dato tiene multiples implemnatcoomes]
//		Animal animal = context.getBean("pajarito",Animal.class);
//		Nido nido = context.getBean(Nido.class);
//		nido.imprimir();
		
		
//		log.info("Animal nombre = {}  edad = {} ", animal.getNombre(), animal.getEdad());
//		
		
	}

}
