package com.spring.beans;

import java.io.StringBufferInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hibernate.springdata.UserRepository;
import com.hibernate.springdata.UsersEntity;

@Service
public class LoginBean {

	@Autowired
	UserRepository ur;
	
	public void createAccount(String userid,String password)	
	{
		UsersEntity ue=new UsersEntity();
		ue.setUid(userid);
		ue.setPwd(password);
		ur.save(ue);
		
	}
	
	public void deleteAccount(String userid)	
	{
		UsersEntity ue=new UsersEntity();
		ue.setUid(userid);
		ur.delete(ue);
		
	}
public String validate(String userid,String password,String firstName,String lastName) {
	List<UsersEntity> records=ur.findByUidAndPwd(userid, password);
	if(records.size() == 0)
		return "bad";
	else
		return "good";
}
}
