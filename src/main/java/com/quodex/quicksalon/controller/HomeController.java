package com.quodex.quicksalon.controller;

import com.quodex.quicksalon.modal.User;
import com.quodex.quicksalon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserService userService;

   @PostMapping("/users")
    public User createUser(@RequestBody User user){
       return userService.createUser(user);
   }


   @GetMapping("/users")
    public List<User> getUser(){
       return userService.fetchAllUser();
   }

}
