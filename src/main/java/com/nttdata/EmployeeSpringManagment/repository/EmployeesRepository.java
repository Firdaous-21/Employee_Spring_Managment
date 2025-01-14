package com.nttdata.EmployeeSpringManagment.repository;

import com.nttdata.EmployeeSpringManagment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {
}
