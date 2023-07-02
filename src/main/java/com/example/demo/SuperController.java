package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class SuperController {

    @GetMapping()
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @GetMapping()
    public String newConflict(String name) {
        return "Hello " + name;
    }


}
