package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.user;

@Repository
public interface UserRepository extends MongoRepository<user, String> {

}
