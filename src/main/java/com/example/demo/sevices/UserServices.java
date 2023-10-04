package com.example.demo.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {

@Autowired
private UserRepository repo;

public List<user> findAll(){
	return repo.findAll();
	
	}
	
}
