package com.nttdata.EmployeeSpringManagment.model;

import com.nttdata.EmployeeSpringManagment.model.enumuration.Role;
import jakarta.persistence.Entity;

@Entity
public class EmployeeFullTime extends Employee {
    private double salaryPerYear;
    private double salary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String name, Role role, double salaryPerYear, double salary) {
        super(name, role);
        this.salaryPerYear = salaryPerYear;
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return salaryPerYear/12;
    }

    public double getSalaryPerYear() {
        return salaryPerYear;
    }
    public void setSalaryPerYear(double salaryPerYear) {
        this.salaryPerYear = salaryPerYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}