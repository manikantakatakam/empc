package com.employee.empc.controller;

import com.employee.empc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = loginService.authenticate(email, password);
        return isAuthenticated ? "Login successful" : "Invalid email or password";
    }
}
