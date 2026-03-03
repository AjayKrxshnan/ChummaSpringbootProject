package com.springproject.FirstProject;


import org.springframework.web.bind.annotation.*;

class User{
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



@RestController
public class HelloController {






    @GetMapping("/hello")
    public String displayHello(){
        return "Hello world";
    }
    // User user = new User()
    //

    @PostMapping("/hello")
    public String greetUser(@RequestBody User user){
        return  "Hello "+user.getName()+" !";

    }
}
