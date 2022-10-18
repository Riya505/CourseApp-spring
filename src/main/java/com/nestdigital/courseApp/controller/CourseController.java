package com.nestdigital.courseApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Homepage(){
        return "welcome to homepage";
    }
    @PostMapping("/read")
    public String Readpage(){
        return "Read Page";
    }
    @GetMapping("/viewall")
    public List viewall(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':'john','age':20}");
        return myList;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/student")
    public String student(){
        return "ria";
    }
}
