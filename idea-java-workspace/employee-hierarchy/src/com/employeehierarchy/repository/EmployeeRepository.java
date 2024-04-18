package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.List;

public interface EmployeeRepository{


    void saveEmployee(Employee employee);

    Employee findEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> getAllEmployees();

}
