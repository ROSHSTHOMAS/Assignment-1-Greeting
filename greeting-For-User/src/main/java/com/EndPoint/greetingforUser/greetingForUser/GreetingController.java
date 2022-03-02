package com.EndPoint.greetingforUser.greetingForUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static  String greet = "Hello %s";
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "azhar")String name){
        return new Greeting(String.format(greet,name));
    }
}
