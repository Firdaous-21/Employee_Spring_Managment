package com.nttdata.EmployeeSpringManagment.model;

import com.nttdata.EmployeeSpringManagment.model.enumuration.Role;
import jakarta.persistence.Entity;

@Entity
public class EmployeeContractor extends Employee{
    private double hourlyRate;
    private double contractDuration;
    private double salary;

    public EmployeeContractor() {
    }

    public EmployeeContractor(String name, Role role, double hourlyRate, double contractDuration, double salary) {
        super(name, role);
        this.hourlyRate = hourlyRate;
        this.contractDuration = contractDuration;
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return salary = hourlyRate * contractDuration;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(double contractDuration) {
        this.contractDuration = contractDuration;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
