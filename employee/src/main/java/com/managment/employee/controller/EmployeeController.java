package com.managment.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.managment.employee.model.Employee;
import com.managment.employee.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/new")
	Employee createEmployee(@RequestBody Employee e) {
		return employeeService.createEmployee(e);
	}

	@GetMapping("/all")
	List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/one/{eid}")
	Employee getEmployee(@PathVariable Integer eid) {
		return employeeService.getEmployee(eid);
	}

	@PutMapping("/update/{eid}")
	Employee updateEmployee(@RequestBody Employee e, @PathVariable Integer eid) {

		return employeeService.updateEmployee(e, eid);
	}

	@DeleteMapping("/delete/{eid}")
	String deleteEmployee(@PathVariable Integer eid) {
		employeeService.deleteEmployee(eid);
		return "Employee " + eid + " Details Deleted Successfully";
	}

	

}
