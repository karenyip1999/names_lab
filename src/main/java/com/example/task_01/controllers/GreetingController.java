package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public Greeting greeting()
    //Endpoint http://localhost:8080/greeting?first_name=jack&age=42
    //public Greeting greet(@RequestParam String first_name, @RequestParam int age)
    {
        Greeting greeting = new Greeting("Karen", "Afternoon");
        return greeting;
    }




}
