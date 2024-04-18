package com.employeehierarchy.model;

public class Manager extends Employee {

    private int teamSize;

    public Manager() {
        System.out.println("Manager Initialized");
    }

    public Manager(int id, String name, String email, float salary, int teamSize) {
        super(id, name, email, salary);
        this.teamSize = teamSize;
    }

    public void scheduleMeeting(){
        System.out.println("Scheduling meetings");
    }


    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void showEmployeeInfo() {
        System.out.println("Manager Info : ");
        System.out.println("ID : " + this.getId());
        System.out.println("Name : " + this.getName());
        System.out.println("Email : " + this.getEmail());
        System.out.println("Salary : " + this.getSalary());

        System.out.println("Team Size : " + teamSize);
    }
}
