package com.ashish.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		//run interface give application context object

		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
//		place on method and ctrl+Left click-->>documentation
		
//		Creating object by us
//		Alien obj=new Alien();
		
//		spring give me object of Alien class
//		in order to method we have to use object
//		getBeam belongs to interface names as application context

		Alien obj=context.getBean(Alien.class);
		
		obj.code();
		
	}

}
