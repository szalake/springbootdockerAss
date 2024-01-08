package com.example.ecllipsedockerdemo;

import org.springframework.stereotype.Controller;



@Controller
public class HomeController {
	
	@RequestMapping("index")
	public String Home()
	{
		System.out.println("Hi");
		return  "index.html";
	}

}
