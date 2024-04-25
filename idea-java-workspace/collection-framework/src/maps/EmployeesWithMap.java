package maps;

import model.Employee;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class EmployeesWithMap {

    public static void main(String[] args) {

        Employee employee1 = new Employee(104,"Harsh",50000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"Gaurav",45000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"Karan",55000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));
        Employee employee5 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));

        Map<Integer,Employee> employees = new HashMap<>();

        employees.put(employee1.getId(),employee1);
        employees.put(employee2.getId(),employee2);
        employees.put(employee3.getId(),employee3);
        employees.put(employee4.getId(),employee4);
        employees.put(employee5.getId(),employee5);

        int id = 101;

        System.out.println(employees.get(id));



    }
}
