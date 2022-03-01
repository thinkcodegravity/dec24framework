package com.strut;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ProfileInterceptor extends AbstractInterceptor
{
	// perofrmance check intercptor
	
    public String intercept(ActionInvocation ai)
    throws Exception
  {
    long startTime = System.currentTimeMillis(); // 1:13:50
    System.out.println("Entering intercepor call");
    String actionResult = ai.invoke(); // give control to busness logic method
    long stopTime = System.currentTimeMillis(); // 1:13:55
    System.out.println("Exiting intercepor call , time taken :" + (stopTime - startTime) + " ms");
    return actionResult;
  }
}
