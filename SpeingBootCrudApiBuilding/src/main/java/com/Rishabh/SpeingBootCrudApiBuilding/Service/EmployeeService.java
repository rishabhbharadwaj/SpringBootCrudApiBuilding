package com.Rishabh.SpeingBootCrudApiBuilding.Service;

import java.util.List;

import com.Rishabh.SpeingBootCrudApiBuilding.Model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee getEmployee(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
