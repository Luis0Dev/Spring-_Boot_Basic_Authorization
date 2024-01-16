package com.Illusion0DEV.Controller;

import com.Illusion0DEV.Services.UserServices;
import com.Illusion0DEV.Entity.User;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {

    public  UserServices userServices;

    @PostMapping
    public User create(@RequestBody User user){
        return  userServices.create(user);
    }
}
