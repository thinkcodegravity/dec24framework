package com.strut;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.beans.CartBean;

public class CartAction {

	@Autowired
	CartBean cart;
	
	public String add2Cart() throws Exception {
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
