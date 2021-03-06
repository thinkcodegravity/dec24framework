package com.hibernate.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
// will have the code to 
// perform CRUD operations
public interface UserRepository 
extends JpaRepository<UsersEntity, String> {
	
	List<UsersEntity> findByUidAndPwd(String u,String p);
	
	
	
	
	List<UsersEntity> findByFirstNameOrLastName(String f,String l);

	// JPQL : written with reference to Java entity program names
	// ? = dynamic binding.. replace ? with live inputs
	@Query("SELECT u FROM UsersEntity u WHERE u.uid= ?1 and u.pwd=?2")
	List<UsersEntity> searchRecordsByJPQL(String uid,String p);
	// searchRecordsByJPQL("john","john123");
	// SELECT u FROM UsersEntity u WHERE u.uid= 'john' and u.pwd='john123'
	
	//SQL : writeen with reference to database table names
	@Query(value="SELECT * FROM users WHERE userid= ?1 and password=?2",nativeQuery = true)
	List<UsersEntity> searchRecordsBySQL(String uid,String p);
	// searchRecordsBySQL("john","john123");
	// SELECT * FROM users WHERE userid= 'john' and password='john123'
		
	
	// start with findBy
		// name of column should be java variable 	
		// not actual column name in table
		public  List<UsersEntity> findByAddress(String address);
		public List<UsersEntity> findByFirstNameAndLastName(String fName,String lName);	
		
		public List<UsersEntity> findByAddressAndLastName(String a,String l);
		
 		
		public List<UsersEntity> findByUid(String users);
		
		
		// JPQL
		@Query("SELECT u FROM UsersEntity u WHERE u.uid= ?1 and u.pwd=?2")
		public List<UsersEntity> verify(String users,String password);
		//SQL
		@Query(value="SELECT * FROM users WHERE userid= ?1 and password=?2",nativeQuery = true)
		public List<UsersEntity> nativeVerify(String users,String password);

		@Transactional
		@Modifying
		@Query("UPDATE UsersEntity u SET u.pwd=?2 WHERE u.uid= ?1")
		public int update(String users,String password);
		
		@Transactional
		@Modifying
		@Query("DELETE UsersEntity u WHERE u.uid= ?1")
		public int delete(String users);
		

}


/*

*/