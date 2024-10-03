package com.newproject.journalApp.controller;

import org.apache.catalina.valves.HealthCheckValve;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class Heathcheck {
	 @GetMapping("/health-check")
	 public String healthCheck() {
		 return "ok";
	 }
	 

}
