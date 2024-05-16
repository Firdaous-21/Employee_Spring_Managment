package com.nttdata.EmployeeSpringManagment.model;

import com.nttdata.EmployeeSpringManagment.model.enumuration.Role;
import com.nttdata.EmployeeSpringManagment.model.interfaces.Payable;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
 public abstract class Employee implements Payable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private boolean flag;

    public Employee() {
    }

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Enum<Role> getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public abstract double calculateSalary();

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
