package com.abhinay.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abhinay.emp.entity.Employee;

@Service
public class EmpService {

	private List<Employee> empList;
	
	public EmpService() {
		empList = new ArrayList<>();
		empList.add(new Employee(101, "Alice", "alice@example.com"));
        empList.add(new Employee(102, "Bob", "bob@example.com"));
        empList.add(new Employee(103, "Charlie", "charlie@example.com"));
	}
	
	public List<Employee> getAllEmp(){
		return empList;
	}
	
	public Optional<Employee> getEmpById(int id) {
		Optional<Employee> emp = empList.stream().filter(e->e.getId()==id).findFirst();
		return emp;
	}
	
	public void addEmp(Employee emp) {
		empList.add(emp);
	}
	
	public Employee updateEmp(int id, Employee emp) {
		for(Employee e: empList) {
			if(e.getId() == id) {
				e.setName(emp.getName());
				e.setEmail(emp.getEmail());
				return e;
			}
		}
		return null;
	}
	
	public void delEmp(int id){
		empList.removeIf(e-> e.getId() == id);
	}
}
