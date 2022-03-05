package com.example.demo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;
import com.hibernate.springdata.UserRepository;
import com.hibernate.springdata.UsersEntity;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JPA_DataAccessLayerTest {
	@Autowired // dependancy injection for all Spring programs
	UserRepository ur;
	

	@Test
	public void testAddressAndLName() {
		List<UsersEntity>  users= ur.findByAddressAndLastName("boston","doe");
		// verify   ( expected number 1, total items in collection)
		assertEquals(        1,            users.size());
	}	
	
	
	@Test
	public void test1CreateUser() {
		UsersEntity user= new UsersEntity("tester", "t123");
		ur.save(user);
		// created 1 record in table.. with userrid/pwd tester/t123
		List<UsersEntity>  users= ur.verify("tester","t123");
		// select * from user where userid='tester' and password='t123'
		// 1 record in table = List should have 1 entity object
		assertEquals(1, users.size());
	}	
	@Test
	public void test2ValidCredentials() {
		List<UsersEntity>  users= ur.verify("tester","t123");
		assertEquals(1, users.size());
	}	
	@Test
	public void test3ChangePwd() {
		int recordsUpdated=ur.update("tester", "t12345");
		assertEquals(1, recordsUpdated);
	}
	@Test
	public void test4DeleteUser() {
		UsersEntity user= new UsersEntity("tester");
		ur.delete(user);
		List<UsersEntity>  users= ur.verify("tester","t12345");
		assertEquals(0, users.size());
	}
	
	
}
