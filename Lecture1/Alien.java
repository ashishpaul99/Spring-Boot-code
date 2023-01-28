package com.ashish.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Spring resposibility for creating alien onbject
@Component //spring says I am responsible to create object of alien class
public class Alien {
	
//	we need laptop to code
//	spring will creat laptopl object
//	object here is not instantiated
	
	@Autowired //-->laptop object is created by spring
	Laptop lap;
	

	public void code()
	{
		lap.compile();
//		System.out.println("I'm coding...");
	}

}
