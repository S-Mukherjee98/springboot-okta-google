package com.example.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ApplicationController {
    @GetMapping("/auth")
    public String greeting(Principal user) {
        return "welcome";
    }
}
