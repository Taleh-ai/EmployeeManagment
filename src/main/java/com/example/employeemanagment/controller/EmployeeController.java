package com.example.employeemanagment.controller;

import com.example.employeemanagment.dto.EmployeRequestDTO;
import com.example.employeemanagment.dto.EmployeResponseDTO;
import com.example.employeemanagment.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/addEmploye")
    public void addEmploye(@RequestBody EmployeRequestDTO dto){
        employeeService.addEmployee(dto);
    }
    @GetMapping("/allEmployee")
    public List<EmployeResponseDTO> getAll(){
       return employeeService.getAllEmployee();
    }
    @DeleteMapping("/delete{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
