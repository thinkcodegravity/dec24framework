package com.spring.beans;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.HttpHeaders;

import io.swagger.annotations.*;
// @ = annotation
@RestController
@Api(description="This is test webservice for Rest tutorial")
public class RestService {

	Logger log=Logger.getLogger("RestService");
	@RequestMapping(value = "/addCal/{param1}/{param2}", method = RequestMethod.GET)
	public int add(@PathVariable(name="param1") int param1, @PathVariable int param2) throws Exception {
		int	sum=param1 + param2;
		System.out.println("Sysout Customer tried to add "+param1+" and "+param2);
		log.debug(" 1 ");
		log.info(" 2 ");
		log.warn(" 3 ");
		log.error(" 4 ");
		
		// debug = detailed logging printing ... used in development
		// info - information purpose... significant event about customer
		// warn - critical message
		// error - exception catch block
		// logging MODE
		// left to right
		// log4j.rootLogger=NONE
		// any message that is printed using INFO and right side of debug
		// all < debug < info < warn < error < off
		
		try {
			
		}catch(Exception e) {
			log.error("program failed",e);
		}
		
		return sum;
	}


	/*
	 /calSimpleInterest = my webservice url
	 method = RequestMethod.POST = webservice is reciving complex input
	 consumes = reciving complex JSON input
	 */
	@RequestMapping(value = "/calSimpleInterest", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="this is simple interest calculator , that is json input based")
	public int calculateSimpleInterest(@RequestBody SimpleInterestInput siInput  ) {
									// argument/parametr = JSON compliant java data type
		System.out.println(siInput.getPrincipal());
		System.out.println(siInput.getTime());
		System.out.println(siInput.getRate());
		int si=siInput.getPrincipal() * siInput.getTime() * siInput.getRate() / 100;
		return si;
	}
	
	@RequestMapping(value = "/multiOutput/{input1}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONNumberOutput calAll(@PathVariable(name="input1")int number) {
		JSONNumberOutput  result=new JSONNumberOutput ();
		result.setAreaOfCircle(  Math.PI * number * number  );
		result.setCube( number * number * number);
		result.setSquare( number * number );
		return result;
	}
	
	
	
	
	
	// webservice to caluclate area of reactangle
	// http://localhost/rectangle/10/20
	@RequestMapping(value = "/rectangle/{input1}/{input2}", method = RequestMethod.GET)
	public int areaOfRect(
			@PathVariable(name="input1")int length, 
			@PathVariable(name="input2") int breadth) {
		int area= length * breadth;
		return area;
	}
	
	// http://localhost/calSI?p=1000&t=10&r=5
	// p=1000
	// @RequestParam("p") int principal
	// value of p ie 1000... assigned to java int variable principal 
	@RequestMapping(value = "/calSI", method = RequestMethod.GET)
	public int calculateSimpleInterest(@RequestParam("p") int principal,
			@RequestParam("t")  int time, 
			@RequestParam("r")  int rate) {
		int simpleInterest = (principal * time * rate)/100;
		return simpleInterest;
	}
	
	// request mapping = connect http url to a java method
	@RequestMapping(value = "/areaOfSquare/{input1}", method = RequestMethod.GET)
	public int calculateSquare(@PathVariable(name="input1") int sides) {
		int area=sides * sides;
		return area;
	}
	@RequestMapping(value = "/subCal", method = RequestMethod.GET)
	public int sub(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		int sub=a - b;
		return sub;
	}
	@RequestMapping(value = "/jsonReqMul", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mulCalculator(@RequestBody Input in) {
		int mul=in.param1 * in.param2;
		return mul;
	}
	
	
	
	
	@RequestMapping(value = "/allMath/{param1}/{param2}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Output allArithmetic(@PathVariable(name="param1") int a,
			@PathVariable(name="param2")  int b){
		Output o=new Output();
		o.sum=a+b;
		o.sub=a-b;
		o.mul=a*b;
		o.div=a/b;
		return o;
	}
	
	
	
	@RequestMapping(value = "/allMath/{param1}/{param2}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserEntity>  multipleRecords(@PathVariable(name="param1") int a,
			@PathVariable(name="param2")  int b){
		Output o=new Output();
		o.sum=a+b;
		o.sub=a-b;
		o.mul=a*b;
		o.div=a/b;
		return o;
	}
	
	
	
}