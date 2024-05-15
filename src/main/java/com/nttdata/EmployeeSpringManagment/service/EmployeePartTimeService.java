package com.nttdata.EmployeeSpringManagment.service;

import com.nttdata.EmployeeSpringManagment.model.EmployeePartTime;
import com.nttdata.EmployeeSpringManagment.repository.EmployeePartTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePartTimeService {
    @Autowired
    EmployeePartTimeRepository employeePartTimeRepository;

    public List<EmployeePartTime> getAllEmployeePartTime(){
        return employeePartTimeRepository.findAllByFlagFalse();
    }

    public Optional<EmployeePartTime> getEmployeePartTimeById(long id){
        return employeePartTimeRepository.findById(id);
    }

    public EmployeePartTime addEmployeePartTime(EmployeePartTime employeePartTime){
        return employeePartTimeRepository.save(employeePartTime);
    }
    public EmployeePartTime updateEmployeePartTime(EmployeePartTime employeePartTime){
      return employeePartTimeRepository.save(employeePartTime);
    }
}
