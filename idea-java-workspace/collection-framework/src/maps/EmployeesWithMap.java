package maps;

import model.Employee;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeesWithMap {

    public static void main(String[] args) {

        Employee employee1 = new Employee(104, "Harsh", 50000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102, "Gaurav", 45000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101, "Karan Sharma", 55000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103, "Karan Dutta", 40000, LocalDate.parse("2024-02-10"));


        Map<Integer, Employee> employees = new HashMap<>();

        employees.put(employee1.getId(), employee1);
        employees.put(employee2.getId(), employee2);
        employees.put(employee3.getId(), employee3);
        employees.put(employee4.getId(), employee4);

        // find all employees with a given name
        String name = "Karan";
        var emps = employees.values().stream()
                .map(Employee::getName)
                .filter(eName -> eName.startsWith(name))
                .collect(Collectors.toList());
        System.out.println(emps);

        // Karan Sharma, Karan Dutta


        var empList = employees.values().stream().sorted((e1, e2) -> Float.compare(e1.getSalary(), e2.getSalary()))
                .toList();

        empList.forEach(System.out::println);





    }
}
