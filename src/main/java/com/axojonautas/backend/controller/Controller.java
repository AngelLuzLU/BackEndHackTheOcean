package com.axojonautas.backend.controller;

import com.axojonautas.backend.model.User;
import com.axojonautas.backend.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    Repository repository;
    @GetMapping("/user")
    public long countUsers(){
        return repository.count();
    }
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        try{
            User _user = (User) repository
                    .save(new User(user.getNombre(), user.getApellido(), user.getEmail(), user.getTelefono(), user.getEstado()));
            return new ResponseEntity<>(_user, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
