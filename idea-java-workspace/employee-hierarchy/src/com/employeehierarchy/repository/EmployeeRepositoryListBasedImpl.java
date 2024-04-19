package com.employeehierarchy.repository;

import com.employeehierarchy.exception.DuplicateEmployeeException;
import com.employeehierarchy.exception.EmployeeNotFoundException;
import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {


    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee){
        // write logic to validate employee
        // throw RuntimeException/Exception if
        // any of the rules aren't followed

        if(employees.stream().anyMatch(e-> e.getId() == employee.getId())){
            throw new DuplicateEmployeeException("Employee with ID "+employee.getId()+" Already Present");
        }

//        for (Employee emp:employees){
//            if (emp.getId()==employee.getId()){
//                throw new DuplicateEmployeeException("Employee with ID "+employee.getId()+" Already Present");
//            }
//        }
        employees.add(employee);
    }


    public Employee findEmployee(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().orElseThrow(
                ()->new EmployeeNotFoundException("Employee with ID "+id+" Not Found"));

//        for (Employee emp:employees){
//            if (emp.getId()==id){
//                return emp;
//            }
//        }
//        throw new EmployeeNotFoundException("Employee with ID "+id+" Not Found");

    }


    public void deleteEmployee(int id) {
        Employee employee = findEmployee(id);
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
