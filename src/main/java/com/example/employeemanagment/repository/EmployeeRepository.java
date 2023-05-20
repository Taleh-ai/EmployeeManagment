package com.example.employeemanagment.repository;

import com.example.employeemanagment.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeEntity,Long> {
    @Override
    List<EmployeEntity> findAllById(Iterable<Long> longs);

}
