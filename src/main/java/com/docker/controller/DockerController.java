package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/")
public class DockerController {
	
	@GetMapping("home")
	public String getHome() {
		return "In Home";
	}
	
	@GetMapping("home2")
	public String getHome2() {
		return "In Home2";
	}

}
