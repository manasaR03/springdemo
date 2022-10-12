package com.excercise.springdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "student" , consumes = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE},
produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
public class StudentController {

    @GetMapping
    public String getStudent(){
        return "mango";
    }


    @PostMapping
    @RequestMapping(consumes = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
    public String createStudent(@RequestBody Student student){
        System.out.println("Create student with name : " + student.getFirstName());
        return "created an student with Student Id = 1";
    }


}
