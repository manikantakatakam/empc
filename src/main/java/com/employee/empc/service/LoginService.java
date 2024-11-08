package com.employee.empc.service;

import com.employee.empc.model.Employee;
import com.employee.empc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public boolean authenticate(String email, String password) {
        Employee employee = employeeRepository.findByEmail(email);
        
        // Simple password check - In production, use hashed passwords for security
        return employee != null && employee.getPassword().equals(password);
    }
}
