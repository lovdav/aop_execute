/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.aspect;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author dml
 */
@Aspect
public class BitacoraAspect 
{
    @Before("execution(* com.ipn.app.service.UsuarioService.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
        
            System.out.println("logBefore() is running!");
            System.out.println("hijacked : " + joinPoint.getSignature().getName());
            System.out.println("******");
    }
    
    @AfterReturning(
      pointcut = "execution(* com.ipn.app.service.UsuarioService.agregarUsuarioReturnValue(..))",
      returning= "result")
   public void logAfterReturning(JoinPoint joinPoint, Object result) {

	System.out.println("logAfterReturning() is running!");
	System.out.println("hijacked : " + joinPoint.getSignature().getName());
	System.out.println("Method returned value is : " + result);
	System.out.println("******");
   }
   
   @AfterThrowing(
      pointcut = "execution(* com.ipn.app.service.UsuarioService.agregarUsuarioThrowException(..))",
      throwing= "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

	System.out.println("logAfterThrowing() is running!");
	System.out.println("hijacked : " + joinPoint.getSignature().getName());
	System.out.println("Exception : " + error);
	System.out.println("******");

    }
    
    @Around("execution(* com.ipn.app.service.UsuarioService.agregarUsuarioAround(..))")
   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

	System.out.println("logAround() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
	System.out.println("Around before is running!");
	joinPoint.proceed(); //continue on the intercepted method
	System.out.println("Around after is running!");
		
	System.out.println("******");

   }
    
    

}
