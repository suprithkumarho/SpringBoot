package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"

        @GetMapping("/teaminfo")
        public String getTeamInfo(){
        return "Coach:"+coachName+", Team name:"+teamName;
        }

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
