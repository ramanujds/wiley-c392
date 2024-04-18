package com.employeehierarchy;

import com.employeehierarchy.model.BackEndDeveloper;
import com.employeehierarchy.model.Developer;
import com.employeehierarchy.model.Employee;
import com.employeehierarchy.model.Manager;
import com.employeehierarchy.repository.EmployeeRepository;
import com.employeehierarchy.repository.EmployeeRepositoryDBImpl;
import com.employeehierarchy.repository.EmployeeRepositoryListBasedImpl;

public class EmployeeHierarchyProgram {

    public static void main(String[] args) {



        Employee employee1 = new Manager(101,"Naresha","naresha@yahoo.com",65000,5);

        Employee employee2 = new BackEndDeveloper(102,"Karan","karan@abc.com",87000,"Java","MySql");

        EmployeeRepository repository = new EmployeeRepositoryDBImpl();

        repository.saveEmployee(employee1);
        repository.saveEmployee(employee2);

        repository.getAllEmployees().forEach(e-> e.showEmployeeInfo());

//        switch (employee){
//            case Manager m -> m.scheduleMeeting();
//            case Developer d -> d.debugCode();
//            default -> System.out.println("Neither a Developer nor a Manager");
//        }






    }
}
