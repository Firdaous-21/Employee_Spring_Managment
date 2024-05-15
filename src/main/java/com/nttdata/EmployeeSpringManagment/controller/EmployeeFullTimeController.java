package com.nttdata.EmployeeSpringManagment.controller;

import com.nttdata.EmployeeSpringManagment.model.EmployeeFullTime;
import com.nttdata.EmployeeSpringManagment.service.EmployeeFullTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeesFullTime")
public class EmployeeFullTimeController {

    private EmployeeFullTimeService employeeFullTimeService;
    @Autowired
    public void setEmployeeFullTimeService(EmployeeFullTimeService employeeFullTimeService) {
        this.employeeFullTimeService = employeeFullTimeService;
    }

    @PostMapping
    public EmployeeFullTime addEmployee(@RequestBody EmployeeFullTime employeeFullTime) {
        return employeeFullTimeService.saveEmployeeFullTime(employeeFullTime);
    }
    @GetMapping
    public List<EmployeeFullTime> getAllEmployees() {
        return employeeFullTimeService.getAllEmployeeFullTime();
    }
    @GetMapping("/{id}")
    public Optional<EmployeeFullTime> getEmployeeById(@PathVariable long id) {
        return employeeFullTimeService.findEmployeeFullTimeById(id);
    }
    @PutMapping
    public EmployeeFullTime updateEmployee(@RequestBody EmployeeFullTime employeeFullTime) {
        return employeeFullTimeService.updateEmployeeFullTime(employeeFullTime);
    }
}
