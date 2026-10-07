package com.managment.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.managment.employee.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee e);
	
	List<Employee>  getAllEmployee();
	
	Employee getEmployee(Integer eid);
	
	Employee  updateEmployee(Employee e,Integer eid);
	
	void  deleteEmployee(Integer eid);
	
	
}
