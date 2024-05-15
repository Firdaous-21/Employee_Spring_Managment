package com.nttdata.EmployeeSpringManagment.controller;

import com.nttdata.EmployeeSpringManagment.model.EmployeePartTime;
import com.nttdata.EmployeeSpringManagment.service.EmployeePartTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeesPartTime")
public class EmployeePartTimeController {

    EmployeePartTimeService employeePartTimeService;
    @Autowired
    public void setEmployeePartTimeService(EmployeePartTimeService employeePartTimeService) {
        this.employeePartTimeService = employeePartTimeService;
    }
    @PostMapping
    public EmployeePartTime addEmployeePartTime(EmployeePartTime employeePartTime) {
        return employeePartTimeService.addEmployeePartTime(employeePartTime);
    }
    @GetMapping
    public List<EmployeePartTime> getAllEmployeePartTimes() {
        return employeePartTimeService.getAllEmployeePartTime();
    }

    @GetMapping("/{id}")
    public Optional<EmployeePartTime> getEmployeePartTime(@PathVariable long id) {
        return employeePartTimeService.getEmployeePartTimeById(id);
    }
    @PutMapping
    public EmployeePartTime updateEmployeePart(EmployeePartTime employeePartTime) {
        return employeePartTimeService.updateEmployeePartTime(employeePartTime);
    }
}
