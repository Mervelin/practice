package com.javawebmail.receive;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReceiveController {

	//@Autowired
	//Receive receive;
	
	@RequestMapping(value = "/receive", method = RequestMethod.GET)
	public Object receive(@RequestParam MultiValueMap<String, String> paramsURL,  
			HttpServletRequest request) throws Exception{
		
	//	Object message = receive.receive();
		
		
		return new Object();
	}
}
