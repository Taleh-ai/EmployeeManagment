package com.example.employeemanagment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    private int salary;
    private String gender;
}
