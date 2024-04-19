package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import exceptionbasics.CustomEmployeeCheckedException;
import exceptionbasics.CustomEmployeeUncheckedException;

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {


    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) throws Exception {
        // UncheckedException
        // if (employee.getId()<0) throw new CustomEmployeeUncheckedException("Id cannot be negative");
        // if (employee.getName()==null || employee.getName()=="") throw new CustomEmployeeUncheckedException("Name cannot be null or empty");
        // if (employee.getEmail()==null || employee.getEmail()=="") throw new CustomEmployeeUncheckedException("Email cannot be null");
        // if (employee.getSalary()<0) throw new CustomEmployeeUncheckedException("Salary cannot be negative");

        // CheckedException
        if (employee.getId()<0) throw new CustomEmployeeCheckedException("Id cannot be negative");
        if (employee.getName()==null || employee.getName()=="") throw new CustomEmployeeCheckedException("Name cannot be null or empty");
        if (employee.getEmail()==null || employee.getEmail()=="") throw new CustomEmployeeCheckedException("Email cannot be null");
        if (employee.getSalary()<0) throw new CustomEmployeeCheckedException("Salary cannot be negative");
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
