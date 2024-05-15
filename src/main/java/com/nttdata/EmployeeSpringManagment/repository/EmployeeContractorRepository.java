package com.nttdata.EmployeeSpringManagment.repository;

import com.nttdata.EmployeeSpringManagment.model.EmployeeContractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeContractorRepository extends JpaRepository<EmployeeContractor, Long> {
public List<EmployeeContractor> findAllByFlagFalse();
}
