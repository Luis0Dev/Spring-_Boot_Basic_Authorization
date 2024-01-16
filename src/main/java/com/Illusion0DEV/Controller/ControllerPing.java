package com.Illusion0DEV.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Ping")

public class ControllerPing {

    @GetMapping
    public String Ping(){

        return "Pong";
    }
}
