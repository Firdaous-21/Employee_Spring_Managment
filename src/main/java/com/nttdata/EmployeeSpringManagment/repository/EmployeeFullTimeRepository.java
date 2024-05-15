package com.nttdata.EmployeeSpringManagment.repository;

import com.nttdata.EmployeeSpringManagment.model.EmployeeFullTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeFullTimeRepository extends JpaRepository<EmployeeFullTime, Long> {
public List<EmployeeFullTime> findAllByFlagFalse();
}
