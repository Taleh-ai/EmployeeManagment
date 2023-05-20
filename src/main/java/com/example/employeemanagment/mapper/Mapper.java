package com.example.employeemanagment.mapper;

import com.example.employeemanagment.dto.EmployeRequestDTO;
import com.example.employeemanagment.dto.EmployeResponseDTO;
import com.example.employeemanagment.entity.EmployeEntity;
import org.springframework.stereotype.Component;

@org.mapstruct.Mapper
@Component
public class Mapper {
public EmployeEntity employeeRequestMapper(EmployeRequestDTO dto){
    EmployeEntity employee = new EmployeEntity();
    employee.setFirstName(dto.getFirstName());
    employee.setLastName(dto.getLastName());
    employee.setDepartment(dto.getDepartment());
    employee.setSalary(dto.getSalary());
    employee.setGender(dto.getGender());
    return employee;
}
    public EmployeResponseDTO employeeResponsetMapper(EmployeEntity entity){
        EmployeResponseDTO employee = new EmployeResponseDTO();
        employee.setId(entity.getId());
        employee.setFirstName(entity.getFirstName());
        employee.setLastName(entity.getLastName());
        employee.setDepartment(entity.getDepartment());
        employee.setGender(entity.getGender());
        return employee;
    }
}
