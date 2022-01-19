package com.strut;

import java.util.ArrayList;

public class FirstStrutAction {
	public String userid;
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

	public String pwd;
	
	public String login() {
		if(userid.equals("john")
				&&
				pwd.equals("john123")
				) {
			myList1.add("apple"); 
			myList1.add("banana"); 
			myList1.add("mango");
			
			myList2.add("onion"); 
			myList2.add("carrot"); 
			myList2.add("tomato");
			
			fName="johnathan";
			lName="doe";
			return "good";
		}else
			return "bad";
			
	}
	
	public String fName;
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

	public String lName;
	public ArrayList<String> getMyList1() {
		return myList1;
	}

	public void setMyList1(ArrayList<String> myList1) {
		this.myList1 = myList1;
	}

	ArrayList<String> myList1=new ArrayList<String>();
	ArrayList<String> myList2=new ArrayList<String>();
	public ArrayList<String> getMyList2() {
		return myList2;
	}

	public void setMyList2(ArrayList<String> myList2) {
		this.myList2 = myList2;
	}
	
	
}
