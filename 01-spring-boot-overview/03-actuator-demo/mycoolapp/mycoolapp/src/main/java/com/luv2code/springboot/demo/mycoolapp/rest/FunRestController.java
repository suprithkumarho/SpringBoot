package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose '/' that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello Suprith";
    }

    //exposing a new api
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5K Hard";
    }

    @GetMapping("fortune")
    public String getTodayFortune(){
        return "Your Lucky Day !!!!!";
    }
}
