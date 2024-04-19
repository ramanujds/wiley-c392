package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {


    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) throws Exception {
        // if (employee.getId()<0) throw new RuntimeException("Id cannot be negative");
        // if (employee.getName()==null || employee.getName()=="") throw new RuntimeException("Name cannot be null or empty");
        // if (employee.getEmail()==null || employee.getEmail()=="") throw new RuntimeException("Email cannot be null");
        // if (employee.getSalary()<0) throw new RuntimeException("Salary cannot be negative");

        if (employee.getId()<0) throw new Exception("Id cannot be negative");
        if (employee.getName()==null || employee.getName()=="") throw new Exception("Name cannot be null or empty");
        if (employee.getEmail()==null || employee.getEmail()=="") throw new Exception("Email cannot be null");
        if (employee.getSalary()<0) throw new Exception("Salary cannot be negative");


    //   else if (employee.getEmail()<0) throw Exception("Email cannot be empty");
            // write logic to validate employee
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
