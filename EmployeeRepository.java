package com.indusind.employee.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.indusind.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Page<Employee> findAll(Pageable pageable);
	
}
