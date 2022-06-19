package com.microservices.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		
		
		return "User service is Taking longer then Expected "
				+ "Please try agian later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		
		
		return "Department service is Taking longer then Expected "
				+ "Please try agian later";
	}

}
