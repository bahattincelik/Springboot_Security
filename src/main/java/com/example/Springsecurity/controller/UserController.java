package com.example.Springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index")
    public String index(){

        return "Index Seite, Willkommen";
    }

    @GetMapping("/dashboard")
    public String dasnboard(){
        return "Login ist erfolgreich.";
    }
}
