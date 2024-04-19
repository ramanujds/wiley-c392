package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {


    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) throws RuntimeException {
        // write logic to validate employee
        if(employee==null||employee.getName() == null ||employee.getId() < 0|| employee.getEmail() == null || employee.getSalary() < 0)
            throw new RuntimeException("Employee object cannot be null");
        // throw RuntimeException/Exception if
        // any of the rules aren't followed
        employees.add(employee);
    }


    public Employee findEmployee(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().get();
    }


    public void deleteEmployee(int id) {
        Employee employee = findEmployee(id);
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
