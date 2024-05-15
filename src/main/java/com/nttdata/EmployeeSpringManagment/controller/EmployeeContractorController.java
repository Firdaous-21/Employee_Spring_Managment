package com.nttdata.EmployeeSpringManagment.controller;

import com.nttdata.EmployeeSpringManagment.model.EmployeeContractor;
import com.nttdata.EmployeeSpringManagment.service.EmployeeContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeesContractor")
public class EmployeeContractorController {

    private EmployeeContractorService employeeContractorService;
    @Autowired
    public void setEmployeeContractorService(EmployeeContractorService employeeContractorService) {
        this.employeeContractorService = employeeContractorService;
    }

    @PostMapping
    public EmployeeContractor addEmployeeContractor(@RequestBody EmployeeContractor employeeContractor) {
        return employeeContractorService.addEmployeeContractor(employeeContractor);
    }

    @GetMapping
    public List<EmployeeContractor> getEmployeeContractorList() {
        return employeeContractorService.getAllEmployeeContractors();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeContractor> getEmployeeContractor(@PathVariable long id) {
        return employeeContractorService.getEmployeeContractorById(id);
    }

    @PutMapping
    public EmployeeContractor updateEmployeeContractor(@RequestBody EmployeeContractor employeeContractor) {
        return employeeContractorService.updateEmployeeContractor(employeeContractor);
    }
}
