package com.managment.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managment.employee.model.Employee;
import com.skillonex.studentportal.modal.Student;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
}
