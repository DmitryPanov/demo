package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class SuperController {

    @GetMapping()
    public String sayHello(String superName) {
        return "Hello " + superName + "!!!";
    }

    @GetMapping()
    public String newConflict(String conflict) {
        System.out.println("conflict = " + conflict);
        //master branch
        return "Hello " + conflict;
    }

    @GetMapping
    public String conflictTwo(String conflictTwo){
        return "Master branch " + conflictTwo;
    }
    @GetMapping
    public String conflictThree(String conflictThree){
        return "Master branch " + conflictThree + "!!!";
    }

}
