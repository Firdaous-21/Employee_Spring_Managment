package com.nttdata.EmployeeSpringManagment.controller;

import com.nttdata.EmployeeSpringManagment.model.Employee;
import com.nttdata.EmployeeSpringManagment.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private EmployeesService employeesService;
    @Autowired
    public EmployeesController(EmployeesService employesService){
        this.employeesService = employesService;
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeesService.addEmployee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeesService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@RequestParam long id) {
        return employeesService.getEmployeeById(id);
    }
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeesService.updateEmployee(employee);
    }
    @DeleteMapping
    public void deleteEmployee(@RequestParam long id) {
        employeesService.deleteEmployee(id);
    }
}
