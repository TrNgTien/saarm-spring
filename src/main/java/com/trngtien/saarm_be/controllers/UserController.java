package com.trngtien.saarm_be.controllers;

import com.sun.tools.jconsole.JConsoleContext;
import com.trngtien.saarm_be.models.User;
import com.trngtien.saarm_be.models.reponses.ResponseObject;
import com.trngtien.saarm_be.repositories.UserRepository;
import com.trngtien.saarm_be.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;


    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @GetMapping("")
    public ResponseEntity<ResponseObject> getAllUsers() {
        Page<User> users =  this.userService.getUsers();

        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(HttpStatus.OK, "GET users", users)
        );
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable UUID id) {
        Optional<User> user =  this.userRepository.findById(id);
        if(user == null) {
            // throw
        }

        return user;
    }
}
