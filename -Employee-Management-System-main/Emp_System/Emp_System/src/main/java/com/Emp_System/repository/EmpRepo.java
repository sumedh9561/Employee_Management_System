package com.Emp_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emp_System.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}