package com.amansoni.SpringWebApp.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping
	public String getHelloSpringHomePage() {
		return "Hello Spring";
	}
	
	@GetMapping("search")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("searching")
	public String getSearchKaro(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("searchingpath/{celebrity_name}")
	public String searchKroPathVariable(@PathVariable(name = "celebrity_name") String value) {
		return value;
	}
	
	@GetMapping(path = "post")
	public void psotKro() {
		System.out.println("running post")
	}
	
}
