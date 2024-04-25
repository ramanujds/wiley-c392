package lists;

import model.Employee;

import java.time.LocalDate;
import java.util.*;

public class ListsExample {

    public static void main(String[] args) {

//        List<String> fruits = new LinkedList<>(List.of("Apple", "Orange", "Mango", "Grapes"));
//
//        // fruits.sort(String::compareTo);
//        // Collections.sort(fruits);
//
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }



        Employee employee1 = new Employee(104,"Harsh",50000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"Gaurav",45000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"Karan",55000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));
        Employee employee5 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));

        List<Employee> employees = new ArrayList<>(List.of(employee1,employee2,employee3,employee4,employee5));

        employees.sort((e1, e2) -> e1.getId() - e2.getId());

        int id = 108;

        Employee emp = null;

        for (var e:employees){
            if (e.getId() == id){
                emp =e;
            }
        }

        System.out.println(emp);

    }

}
