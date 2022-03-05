package com.example.demo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//add multiple test cases into 1 test suite
// each test suite class has multiple test cases
@SuiteClasses({TestCaseCoreJava.class,Struts_ControllerLayerTest.class,Spring_ModelLayerTest.class,JPA_DataAccessLayerTest.class})
public class ShoppingFrameworkApplicationTests {

}
