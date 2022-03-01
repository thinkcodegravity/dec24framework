package com.strut;

import java.util.ArrayList;

public class JSONStrutAction {
	public String userAvailable() {
		ArrayList<String> registeredNames=new ArrayList<String> ();
		registeredNames.add("john");
		registeredNames.add("jane");
		if(registeredNames.contains(userid))
			available=false;
		else
			available=true;
		
		return "good";
	}
	
	
	public String userid;
	public boolean available;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
