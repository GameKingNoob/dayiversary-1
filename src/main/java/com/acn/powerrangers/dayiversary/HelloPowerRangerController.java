package com.acn.powerrangers.dayiversary;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPowerRangerController {

	@GetMapping("/rangers")
	public String hello() {
		return "Hello PowerRanger Ali";
	}
	
	@PostMapping("/rangers")
	public void createRanger(@RequestBody Map rangerInfo){
		System.out.println(rangerInfo.get("name"));
	}

}
