package com.nttdata.EmployeeSpringManagment.service;

import com.nttdata.EmployeeSpringManagment.model.EmployeeFullTime;
import com.nttdata.EmployeeSpringManagment.repository.EmployeeFullTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeFullTimeService {
    @Autowired
    private EmployeeFullTimeRepository employeeFullTimeRepository;


    public List<EmployeeFullTime> getAllEmployeeFullTime(){
        return employeeFullTimeRepository.findAllByFlagFalse();
    }

    public Optional<EmployeeFullTime> findEmployeeFullTimeById(long id) {
        return employeeFullTimeRepository.findById(id);
    }

    public EmployeeFullTime saveEmployeeFullTime(EmployeeFullTime employeeFullTime){
        return employeeFullTimeRepository.save(employeeFullTime);
    }

    public EmployeeFullTime updateEmployeeFullTime(EmployeeFullTime employeeFullTime){
        return employeeFullTimeRepository.save(employeeFullTime);
    }


}
