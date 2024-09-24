package com.abhinay.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhinay.emp.entity.Employee;
import com.abhinay.emp.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private final EmpService empService = new EmpService();
	
	@GetMapping("")
	public List<Employee> getAllEmp(){
		return empService.getAllEmp();
	}
	
	@GetMapping("/getEmp")
	public Optional<Employee> getEmpById(@RequestParam("id") int id) {
		return empService.getEmpById(id);
	}
	
	@PostMapping("/addEmp")
	public void addEmp(@RequestBody Employee emp) {
		empService.addEmp(emp);
	}
	
	@PutMapping("/updateEmp")
	public Employee updateEmp(@RequestParam("id") int id, @RequestBody Employee emp) {
		return empService.updateEmp(id, emp);
	}
	
	@DeleteMapping("/delEmp")
	public void delEmp(@RequestParam("id") int id){
		empService.delEmp(id);
	}
}
