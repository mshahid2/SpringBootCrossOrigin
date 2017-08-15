/**
 * 
 */
package com.xavient.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Md Shahid.
 *
 */
@RestController
public class RequestController {
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping ("/xav/{pramName}")
	private String getRequestDetail(@PathVariable final String pramName)
	{
		System.out.println("i am here");
		return "Hello Bhai kyse ho : " + pramName;
	}
	
	@RequestMapping("/crossAllowed/{pramName}")
    public String greetingWithJavaconfig(@PathVariable final String pramName) {
    	System.out.println("i am here");
		return "Hello Bhai kyse ho : " + pramName;
    }
}
