package model;

import java.time.LocalDate;
import java.util.Locale;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private float salary;
    private LocalDate joinDate;

    public Employee(int id, String name, float salary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employee employee)) return false;

        return id == employee.id && Float.compare(salary, employee.salary) == 0 && name.equals(employee.name) && joinDate.equals(employee.joinDate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + Float.hashCode(salary);
        result = 31 * result + joinDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joinDate=" + joinDate +
                '}';
    }

    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }
}
