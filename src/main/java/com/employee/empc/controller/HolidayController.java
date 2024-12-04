package com.employee.empc.controller;

import com.employee.empc.model.Employee;
import com.employee.empc.model.Holidays;
import com.employee.empc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holidays")
public class HolidayController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Holidays> getAllHolidays() {
        return employeeService.getAllHolidays();
    }

    @PostMapping
    public Holidays createHoliday(@RequestBody Holidays holiday) {
        return employeeService.createHoliday(holiday);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHoliday(@PathVariable String id) {
        employeeService.deleteHoliday(id);
        return ResponseEntity.noContent().build();
    }

}
