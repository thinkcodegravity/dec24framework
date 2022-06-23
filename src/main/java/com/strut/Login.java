package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

// MODEL LAYER PROGRAM
// Strut Action program
public class Login implements ServletRequestAware{
	// BUSINESS logic method
	public String validate() {
		//servletFeatures.getSession();
		//servletFeatures.getAttribute("");
		
		if(userid.equals("java") && password.equals("jee"))
		{
			firstName="john";
			lastName="doe";
			return "good";
		}
		else
		{
			inputStream = new StringBufferInputStream("text response : login failed");
			return "bad";
		}
	}
	// FORM bean
	public String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String lastName;
	
	public String password;
	public String userid;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public InputStream inputStream;
	public HttpServletRequest servletFeatures;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		servletFeatures=request;
	}
 		
}
