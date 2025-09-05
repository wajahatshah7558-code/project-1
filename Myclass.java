package com.example.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("se")
public class Myclass {
    @GetMapping("print")
    public String print(){
        return "lelo";
    }
}

