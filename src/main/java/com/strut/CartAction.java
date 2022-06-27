package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.beans.CartBean;
import com.spring.beans.qualifier.ICar;

public class CartAction {

	@Autowired
	CartBean cart;
	
	@Qualifier("to")
	ICar ic;
	
	public String add2Cart() throws Exception {
		System.out.println("entered cart action");
		// joint point
		String cartDetails=cart.add(cartItem);
		
		
		inputStream = new StringBufferInputStream(cartDetails);
		return "success";
	}
	
	public InputStream inputStream;
 	public String cartItem;
	public String getCartItem() {
		return cartItem;
	}
	public void setCartItem(String cartItem) {
		this.cartItem = cartItem;
	}
	
}
