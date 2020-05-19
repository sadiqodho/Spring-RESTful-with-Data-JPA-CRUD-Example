package com.restful.example.controllers;

import com.restful.example.models.User;
import com.restful.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Abro on 5/19/2020.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get-users")
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/get-user")
    public Optional<User> findById(@RequestParam(name = "id", required = true) Integer id){
        return userRepository.findById(id);
    }

    @PostMapping("/add-user")
    public User add(@RequestParam(name = "id", required = false) Integer id,
                    @RequestParam(name = "name") String name,
                    @RequestParam(name = "age") Integer age,
                    @RequestParam(name = "gender") Character gender,
                    @RequestParam(name = "address") String address){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);
        user.setAddress(address);
        return userRepository.save(user);
    }

    @DeleteMapping("/delete-user")
    public void delete(@RequestParam(name = "id", required = true) Integer id){
        userRepository.deleteById(id);
    }

}
