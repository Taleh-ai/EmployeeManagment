package com.example.employeemanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeRequestDTO {
    private String firstName;
    private String lastName;
    private String department;
    private int salary;
    private String gender;
}
