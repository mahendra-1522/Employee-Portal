package com.managment.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managment.employee.model.Employee;
import com.managment.employee.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee createEmployee(Employee e) {
		
		return employeeRepo.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployee(Integer eid) {
		
		return employeeRepo.findById(eid).orElseThrow();
	}

	@Override
	public Employee updateEmployee(Employee e, Integer eid) {
		
		Employee edetails=getEmployee(eid);
		
		edetails.setDept(e.getDept());
		edetails.setSalary(e.getSalary());
		edetails.setEName(e.getEName());
		
		return employeeRepo.save(edetails);
	}

	@Override
	public void deleteEmployee(Integer eid) {
		employeeRepo.deleteById(eid);
		
	}

	

	

}
