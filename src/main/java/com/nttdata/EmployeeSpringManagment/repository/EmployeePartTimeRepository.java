package com.nttdata.EmployeeSpringManagment.repository;

import com.nttdata.EmployeeSpringManagment.model.EmployeePartTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePartTimeRepository extends JpaRepository<EmployeePartTime, Long> {
    public List<EmployeePartTime> findAllByFlagFalse();
}
