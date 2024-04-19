package com.employeehierarchy;

import com.employeehierarchy.model.*;
import com.employeehierarchy.repository.EmployeeRepository;
import com.employeehierarchy.repository.EmployeeRepositoryDBImpl;
import com.employeehierarchy.repository.EmployeeRepositoryListBasedImpl;

public class EmployeeHierarchyProgram {

    public static void main(String[] args) {



        Employee employee1 = new Manager(101,"Naresha","naresha@yahoo.com",65000,
                new Address("Kormangla","Bangalore",560029,"Karnataka"),5);
        System.out.println(employee1);

        Employee employee2 = new BackEndDeveloper(102,"Karan","karan@abc.com",87000,"Java", new Address("Jayanagar","Bangalore",560011,"Karnataka"),"MySql");

        EmployeeRepository repository = new EmployeeRepositoryListBasedImpl();

        try{
            repository.saveEmployee(employee1);
            repository.saveEmployee(employee2);
        }catch (RuntimeException e){
            System.out.println("Error:"+e);
        }

        repository.getAllEmployees().forEach(e-> e.showEmployeeInfo());

//        switch (employee){
//            case Manager m -> m.scheduleMeeting();
//            case Developer d -> d.debugCode();
//            default -> System.out.println("Neither a Developer nor a Manager");
//        }






    }
}
