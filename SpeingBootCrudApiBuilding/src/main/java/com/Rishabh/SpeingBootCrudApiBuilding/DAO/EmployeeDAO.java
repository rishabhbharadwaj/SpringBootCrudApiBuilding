package com.Rishabh.SpeingBootCrudApiBuilding.DAO;

import java.util.List;
import com.Rishabh.SpeingBootCrudApiBuilding.Model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee getEmployee(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
