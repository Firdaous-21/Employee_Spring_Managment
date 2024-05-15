package com.nttdata.EmployeeSpringManagment.model;

import com.nttdata.EmployeeSpringManagment.model.enumuration.Role;
import jakarta.persistence.Entity;

@Entity
public class EmployeePartTime extends Employee {
    private double workingHours;
    private double hourlyRate;
    private double salary;
    public EmployeePartTime() {

    }

    public EmployeePartTime(String name, Role role, double workingHours, double hourlyRate, double salary) {
        super(name, role);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return  workingHours * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
