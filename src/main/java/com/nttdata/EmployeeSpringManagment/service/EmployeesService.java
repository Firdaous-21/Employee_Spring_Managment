package com.nttdata.EmployeeSpringManagment.service;

import com.nttdata.EmployeeSpringManagment.exceptions.EmployeeNotFoundException;
import com.nttdata.EmployeeSpringManagment.model.Employee;
import com.nttdata.EmployeeSpringManagment.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {
    private EmployeesRepository employeesRepository;
    @Autowired
    public void setEmployeesRepository(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeesRepository.findById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeesRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        Employee employee = employeesRepository.findById(id).orElseThrow(()-> {
            String message = "Employee not found for this id : " + id;
            throw new EmployeeNotFoundException(message); }
        );
        employee.setFlag(true);
        employeesRepository.save(employee);

    }
}
