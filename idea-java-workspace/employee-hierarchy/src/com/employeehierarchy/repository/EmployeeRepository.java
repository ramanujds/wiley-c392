package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.List;

public interface EmployeeRepository{


    void saveEmployee(Employee employee) throws Exception;

    Employee findEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> getAllEmployees();

}
