package com.quodex.quicksalon.service;

import com.quodex.quicksalon.modal.User;
import com.quodex.quicksalon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    //create a new user
    public User createUser(User user){
        return userRepository.save(user);
    }

    //get all the users
    public List<User> fetchAllUser(){
        return userRepository.findAll();
    }


}
