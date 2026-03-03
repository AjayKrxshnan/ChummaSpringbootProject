package com.springproject.FirstProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    private String displayHello(){
        return "Hello world";
    }

}
