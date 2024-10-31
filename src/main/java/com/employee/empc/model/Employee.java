package com.employee.empc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "employees")
public class Employee {
    @Id
    private String id;

    // Personal Information
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String profilePhotoUrl;

    // Job-Related Information
    private String department;
    private String position;
    private double salary;
    private Date joiningDate;
    private List<String> skills; // Array of skills for the employee

    // Administrative Information
    private String status;  // Employment status (e.g., Active, Inactive)
    private String managerId; // ID of the employee's manager, if applicable
    private List<String> projects; // Array of project IDs the employee is involved in

}
