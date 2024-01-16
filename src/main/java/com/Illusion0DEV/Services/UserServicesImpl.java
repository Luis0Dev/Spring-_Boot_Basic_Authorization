package com.Illusion0DEV.Services;

import com.Illusion0DEV.Repository.UserRepository;
import com.Illusion0DEV.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user){
        User existUser = userRepository.findByUsername(user.getUsername());

        if(existUser != null){
            throw  new Error("User Already Exist!");
        }

        user.setPassword(passwordEncoder().encode(user.getPassword()));
        User createdUser = userRepository.save(user);

        return  null;
    }
}
