package com.employeehierarchy.model;

public abstract class Developer extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(){

    }

    public Developer(int id, String name, String email, float salary, String programmingLanguage){
        super(id,name,email,salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void debugCode(){
        System.out.println("Debugging Code");
    }


    public abstract void showEmployeeInfo();

}
