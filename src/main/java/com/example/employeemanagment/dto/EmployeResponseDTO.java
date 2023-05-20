package com.example.employeemanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    private String gender;
}
