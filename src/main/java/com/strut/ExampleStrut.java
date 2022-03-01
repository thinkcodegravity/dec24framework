package com.strut;

import java.sql.Connection;
import java.util.ArrayList;

// complete/ fully qualified class name
public class ExampleStrut {
	String customerId; // login data... login webpage customer typed userid
	String customerPwd; // login data... login webpage customer typed password
	public String checkCredentials()		
	{ 	
		myList1.add("apple"); myList1.add("banana"); myList1.add("mango");
		myList2.add("onion"); myList2.add("potato"); myList2.add("tomato");
		
		if(customerId.equals("john") && customerPwd.equals("john123")) {
			fName="johnathan";
			lName="doe";
			address="new york";
			return "success";
		}
		else if(customerId.equals("jane") && customerPwd.equals("jane123")) {
			fName="jane";
			lName="joe";
			address="vegas";
			return "success";
		}
		else
			return "failure";
	}	
	
	
	// struts property
	ArrayList<String> myList1=new ArrayList<String> (); // passed onto welcome webpage...
	ArrayList<String> myList2=new ArrayList<String> (); // passed onto welcome webpage...
	String fName; // passed onto welcome webpage... 
	String lName;// passed onto welcome webpage... 
	String address;// passed onto welcome webpage... 
	
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	/*
	 
	 try {
			 conn=DatabaseConnection.getDBConnection();
			boolean result=UsersTable.validateLogin(customerId, customerPwd, conn);
			if(result==true)
				return "success";
			elseConnection
				return "failure";
		}catch(Exception e) {
			return "failure";
		}
		
	 */
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPwd() {
		return customerPwd;
	}

	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}

		
}
