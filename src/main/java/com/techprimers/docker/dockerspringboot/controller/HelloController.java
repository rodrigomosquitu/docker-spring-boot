package com.techprimers.docker.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		System.out.println("TESTE");
		return "TESTE";
	}
}
