package com.employee.empc.service;

import com.employee.empc.model.Employee;
import com.employee.empc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(String id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
    
        // Update personal information
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setPassword(employeeDetails.getPassword()); // Be cautious with updating passwords; ensure proper security.
        employee.setPhone(employeeDetails.getPhone());
        employee.setAddress(employeeDetails.getAddress());
        employee.setProfilePhotoUrl(employeeDetails.getProfilePhotoUrl());
    
        // Update job-related information
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setPosition(employeeDetails.getPosition());
        employee.setSalary(employeeDetails.getSalary());
        employee.setJoiningDate(employeeDetails.getJoiningDate());
        employee.setSkills(employeeDetails.getSkills());
    
        // Update administrative information
        employee.setStatus(employeeDetails.getStatus());
        employee.setManagerId(employeeDetails.getManagerId());
        employee.setProjects(employeeDetails.getProjects());
    
        return employeeRepository.save(employee);
    }
        

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
