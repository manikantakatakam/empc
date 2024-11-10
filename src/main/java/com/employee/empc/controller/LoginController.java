package com.employee.empc.controller;

import com.employee.empc.model.Employee;
import com.employee.empc.service.EmployeeService;
import com.employee.empc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import java.util.List;

// import javax.servlet.RequestDispatcher;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employee login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = loginService.authenticate(email, password);
        Employee employee = employeeService.getEmployeeByEmail(email);
        if (isAuthenticated) {
            return employee;
        } else {
            throw new RuntimeException("Employee with email " + email + " not found");
        }
    }

    // @PostMapping
    // public void login(@RequestParam String email, @RequestParam String password,
    //                   HttpServletRequest request, HttpServletResponse response) throws Exception {
    //     boolean isAuthenticated = loginService.authenticate(email, password);
        
    //     if (isAuthenticated) {
    //         RequestDispatcher dispatcher = request.getRequestDispatcher("/api/login/getByEmail?email=" + email);
    //         dispatcher.forward(request, response);
    //     } else {
    //         response.getWriter().write("Invalid email or password");
    //     }
    // }

    @GetMapping("/getByEmail")
    public Employee getEmployeeByEmail(@RequestParam String email) {
        Employee employee = employeeService.getEmployeeByEmail(email);
        
        if (employee != null) {
            return employee;
        } else {
            throw new RuntimeException("Employee with email " + email + " not found");
        }
    }
}
