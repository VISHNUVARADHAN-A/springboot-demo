package com.bot.javaspringboot.demo.bot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
@GetMapping("/")
public String sayHello() {
    return "Hello World! bye world!";
}


// expose new endpoint 
@GetMapping("/workout")
public String getDailyWorkout() {
    return "Run a hard 5k!";
}
@GetMapping("/test1")
public String testthisexample() {
    return "Run a hard 3000 ";
}
}
