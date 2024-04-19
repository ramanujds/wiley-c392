package com.employeehierarchy.model;

public class BackEndDeveloper extends Developer {

    private String database;

    public String getDatabase() {
        return database;
    }

    public BackEndDeveloper(String database) {
        super();
        this.database = database;
    }

    public BackEndDeveloper(int id, String name, String email, float salary, String programmingLanguage, Address address, String database) {
        super(id, name, email, salary, address, programmingLanguage);
        this.database = database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public void showEmployeeInfo() {

        System.out.println("Developer Info : ");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("ID : " + this.getId());
        System.out.println("Name : " + this.getName());
        System.out.println("Email : " + this.getEmail());
        System.out.println("Salary : " + this.getSalary());
        System.out.println("Programming Language : " + getProgrammingLanguage());
        System.out.println("Database : "+database);
        System.out.println("Address : "+getAddress());

    }
}
