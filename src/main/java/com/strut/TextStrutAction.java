package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;

public class TextStrutAction {
	public String userAvailable() {
		ArrayList<String> registeredNames=new ArrayList<String> ();
		registeredNames.add("john");
		registeredNames.add("jane");
		if(registeredNames.contains(userid))
			inputStream = new StringBufferInputStream("user id "+userid+" is taken");
		else
			inputStream = new StringBufferInputStream("user id "+userid+"is available");
			
		return "good";
	}
	
	public InputStream inputStream;
	public String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
