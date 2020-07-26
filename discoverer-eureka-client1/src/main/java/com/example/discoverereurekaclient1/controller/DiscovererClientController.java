package com.example.discoverereurekaclient1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscovererClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/sayHi")
	public String getHiFromClient() {
		return restTemplate.getForObject("http://EUREKA-CLIENT-1/client1/hello", String.class);
	}
}
