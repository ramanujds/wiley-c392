package com.employeehierarchy;

import com.employeehierarchy.model.Developer;
import com.employeehierarchy.model.Employee;
import com.employeehierarchy.model.Manager;

public class EmployeeHierarchyProgram {

    public static void main(String[] args) {

//        Employee employee1 = new Employee(101,"Naresha","naresha@yahoo.com",65000);
//
//        Employee employee2 = new Employee();

        Employee employee;

        employee = new Manager(101,"Naresha","naresha@yahoo.com",65000,5);


        employee.showEmployeeInfo();

        employee = new Developer(102,"Karan","karan@abc.com",87000,"Java");

        employee.showEmployeeInfo();




    }
}
