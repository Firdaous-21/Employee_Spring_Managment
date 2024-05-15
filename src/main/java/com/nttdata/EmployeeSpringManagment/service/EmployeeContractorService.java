package com.nttdata.EmployeeSpringManagment.service;

import com.nttdata.EmployeeSpringManagment.model.EmployeeContractor;
import com.nttdata.EmployeeSpringManagment.repository.EmployeeContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeContractorService {
    @Autowired
    EmployeeContractorRepository employeeContractorRepository;

    public List<EmployeeContractor> getAllEmployeeContractors() {
        return employeeContractorRepository.findAllByFlagFalse();
    }

    public Optional<EmployeeContractor> getEmployeeContractorById(long id) {
        return employeeContractorRepository.findById(id);
    }

    public EmployeeContractor addEmployeeContractor(EmployeeContractor employeeContractor) {
        return employeeContractorRepository.save(employeeContractor);
    }

    public EmployeeContractor updateEmployeeContractor(EmployeeContractor employeeContractor) {
        return employeeContractorRepository.save(employeeContractor);
    }

}
