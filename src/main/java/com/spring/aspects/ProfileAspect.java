package com.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hibernate.springdata.UsersEntity;

@Aspect
@Component
public class ProfileAspect  {
	
	
	@Around("within(com.spring.beans.CartBean)")
	public String getResponseTime(ProceedingJoinPoint  joinPoint) throws Throwable{
		System.out.println(" aspect code before");
		String s=(String)joinPoint.proceed();
		System.out.println("aspect code after");
		return s;
	}
	
/*
	@AfterThrowing("within(com.spring.beans.ProfileBean)")
	public void getResponseTime( ) throws Throwable{
		// ******************** SECURITY *************************
		System.out.println("\n\n >>>>>>>>>>> PERFORMING SECURITY CHECK >>>>>>>>>>>");
		String remoteAddress = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes())
			       .getRequest().getRemoteAddr();
		if(remoteAddress.equals("1.2.3.4")) {
			System.out.println("client is blocked for security reason");
			throw new Exception("Blocked Customer");
		}
		
		// ******************** LOGGING *************************		
		System.out.println("\n\n >>>>>>>>>>> SPRING ASPECT LOGGING >>>>>>>>>>>");
	}
*/	
	/*
	@Around("execution(* com.spring.beans.ProfileBean.register(java.lang.String,java.lang.String))")
	public UsersEntity getResponseTime(ProceedingJoinPoint  joinPoint) throws Exception{
		// ******************** SECURITY *************************
		String remoteAddress = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes())
			       .getRequest().getRemoteAddr();
		if(remoteAddress.equals("1.2.3.4")) {
			System.out.println("client is blocked for security reason");
			throw new Exception("Blocked Customer");
		}
		
		// ******************** LOGGING *************************		
		System.out.println("\n\n >>>>>>>>>>> SPRING ENTER >>>>>>>>>>>");
		System.out.println(" Entering Aspect - response time performance");
		
		// ******************** PERFORMANCE MONITOR *************************		
		long startTime=System.currentTimeMillis();
		UsersEntity result=null;
		
		// ******************** EXCEPTION HANDLING *************************		
		try {
			result=(UsersEntity)joinPoint.proceed();// give control to bean class
		} catch (Throwable e) {
			e.printStackTrace();
		}
		long stopTime=System.currentTimeMillis();
		System.out.println("Time taken to process this request :"+(stopTime-startTime)+"ms");
		System.out.println("Exit Aspect -     response time performance");
		System.out.println(">>>>>>>>>>> SPRING EXIT >>>>>>>>>>>");
		return result;
	}
	
	/*
	@Before("pointcut1()")
	public Object advice1(ProceedingJoinPoint  joinPoint){
			.....code....
	}
	@Before("pointcut1()") // apply point cut
	public Object advice1(ProceedingJoinPoint  joinPoint){
			.....code....
	}
	@Pointcut("within(com.spring.beans.ProfileBean)")
	public void pointcut1(){ }
	 */
	
}
