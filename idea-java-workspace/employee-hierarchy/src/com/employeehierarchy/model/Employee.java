package com.employeehierarchy.model;

public class Employee {

    protected int id;
    protected String name;
    protected String email;
    protected float salary;

    public Employee(int id, String name, String email, float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Employee(){
        System.out.println("Employee Initialized");
    }

    public Employee(int id){
        this.id = id;
    }

    public void setId(int id){
            this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmployeeDetails(int id){
        this.id = id;
    }

    public void setEmployeeDetails(String name){
        this.name = name;
    }


    public void showEmployeeInfo(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary : "+salary);
    }

}
