package com.strut;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;

public class LoginStrutAction implements ServletRequestAware {
	public String pwd;
	public String userid;
	
	public String checkUser() {
		myList1.add("apple"); 
		myList1.add("banana"); 
		myList1.add("mango");
		
		myList2.add("onion"); 
		myList2.add("carrot"); 
		myList2.add("tomato");
		
		//httpReq.setAttribute("", "");
		//httpReq.getParameter("userid");
		// access session using servlet object, provided by servletrequestawre interface
		httpReq.getSession().setAttribute("login", true);
		// access sesion using strut action context
		//httpReq.getServletContext().setAttribute("", "");
		

		if(userid.equals("john") && pwd.equals("john1!"))
		{
			fName="johnathan";
			lName="doe";
			return "good";
		}
		else if(userid.equals("jane") && pwd.equals("jane1!"))
		{
			fName="jane";
			lName="doe";
			return "good";
		}
		else
			return "bad";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String fName;
	public String lName;
	ArrayList<String> myList1=new ArrayList<String>();
	ArrayList<String> myList2=new ArrayList<String>();
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
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

	HttpServletRequest httpReq;

	public void setServletRequest(HttpServletRequest req) {
		httpReq=req;
	}

}
