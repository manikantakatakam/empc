package com.employee.empc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class first {

    @GetMapping
    public String greet() {
        return "Jai Shree Ram......";
    }
}
