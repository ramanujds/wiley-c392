package com.employeehierarchy.model;

public class Developer extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(int id, String name, String email, float salary, String programmingLanguage){
        super(id,name,email,salary);
        this.programmingLanguage = programmingLanguage;
    }


    public void showEmployeeInfo(){
        System.out.println("Developer Info : ");
        super.showEmployeeInfo();
        System.out.println("Programming Language : "+programmingLanguage);
    }

}
