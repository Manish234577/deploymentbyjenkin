package com.learn.jenkindeploying.deployingjenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlelr {
	@GetMapping("/")
	public String gethome() {
		return "home";
	}

}
