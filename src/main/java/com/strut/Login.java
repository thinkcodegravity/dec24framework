package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

// MODEL LAYER PROGRAM
// Strut Action program
public class Login implements ServletRequestAware{
	// BUSINESS logic method
	public String validate() {
		//servletFeatures.getSession();
		//servletFeatures.getAttribute("");
		myList1.add("nissan"); 
		myList1.add("toyota"); 
		myList1.add("ferrari");
		
		myList2.add("onion"); 
		myList2.add("carrot"); 
		myList2.add("tomato");
		if(userid.equals("john") && password.equals("john1!"))
		{
			firstName="john";
			lastName="doe";
			return "good";
		}
		else if(userid.equals("jane") && password.equals("jane1!"))
		{
			firstName="jane";
			lastName="joe";
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
	ArrayList<String> myList1=new ArrayList<String>();
	public ArrayList<String> getMyList1() {
		return myList1;
	}
	public void setMyList1(ArrayList<String> myList1) {
		this.myList1 = myList1;
	}
	public ArrayList<String> getMyList2() {
		return myList2;
	}
	public void setMyList2(ArrayList<String> myList2) {
		this.myList2 = myList2;
	}
	ArrayList<String> myList2=new ArrayList<String>();
	
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
