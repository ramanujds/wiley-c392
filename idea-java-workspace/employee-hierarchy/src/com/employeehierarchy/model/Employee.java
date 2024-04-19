package com.employeehierarchy.model;

public abstract class Employee {

    private int id;  // non-negative
    private String name; // shouldn't be null or blank
    private String email; // shouldn't be null or blank
    private float salary; // non-negative
    private Address address;

    public Employee(int id, String name, String email, float salary, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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


    public abstract void showEmployeeInfo();

}
