package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.user;

@RequestMapping(value ="/users")
@RestController
public class userResources {
	
@GetMapping
	
	public ResponseEntity<List<user>>  findAll(){
		
		user Maria = new user("23", "Maria Brown", "MariaBrown@gmail.com");
		user joao = new user("766","joao green", "joaoGreen@outlook.com");
		
		List<user> list = new ArrayList<>();
		list.addAll(Arrays.asList(Maria,joao));
	 
		return ResponseEntity.ok().body(list);
		
	}

}
