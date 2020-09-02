//package com.example.bangerco.controller;
//
//import com.example.bangerco.model.User;
//import com.example.bangerco.repository.UserRepository;
//import com.example.bangerco.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user){ return service.saveUser(user);}
//
//    @GetMapping("/users")
//    public List<User> findAllProducts() { return service.getUsers(); }
//
//}
