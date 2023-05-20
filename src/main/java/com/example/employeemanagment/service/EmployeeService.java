package com.example.employeemanagment.service;

import com.example.employeemanagment.dto.EmployeRequestDTO;
import com.example.employeemanagment.dto.EmployeResponseDTO;
import com.example.employeemanagment.entity.EmployeEntity;
import com.example.employeemanagment.mapper.Mapper;
import com.example.employeemanagment.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private  final Mapper mapper;


    public void addEmployee(EmployeRequestDTO dto){
        employeeRepository.save(mapper.employeeRequestMapper(dto));
    }
    public void deleteEmployee(Long id ){
        EmployeEntity entity = employeeRepository.findById(id).orElseThrow();
      employeeRepository.delete(entity);
    }
    public List<EmployeResponseDTO> getAllEmployee(){
       return employeeRepository.findAll().stream().map(n->mapper.employeeResponsetMapper(n)).collect(Collectors.toList());
    }
    public EmployeResponseDTO  getUser(Long id){
     EmployeEntity entity=   employeeRepository.findById(id).orElseThrow();
        return mapper.employeeResponsetMapper(entity) ;
    }
}
