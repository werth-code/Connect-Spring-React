package com.matthewwerth.springbootreactconnect.controller;

import com.matthewwerth.springbootreactconnect.model.User;
import com.matthewwerth.springbootreactconnect.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") //Watch for this! No / after !!!!!
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

}
