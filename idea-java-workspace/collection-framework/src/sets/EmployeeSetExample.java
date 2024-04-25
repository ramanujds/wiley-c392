package sets;

import model.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//class CompareBySalary implements Comparator<Employee>{
//    public int compare(Employee e1, Employee e2) {
//        return (int)(e1.getSalary()-e2.getSalary());
//    }
//}

public class EmployeeSetExample {

    public static void main(String[] args) {

   //     Comparator<Employee> comparator = new CompareBySalary();
        Set<Employee> employees = new TreeSet<>((e1,e2)->Float.compare(e1.getSalary(),e2.getSalary()));

        Employee employee1 = new Employee(104,"Harsh",50000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"Gaurav",45000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"Karan",55000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));
        Employee employee5 = new Employee(103,"Lokesh",40000, LocalDate.parse("2024-02-10"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);



        for (var emp:employees){
            System.out.println(emp);
        }

    }

}
