public class Employee {

    int id;
    String name;
    String email;
    float salary;



    public Employee(int id, String name, String email, float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }



    void printEmployee(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary : "+salary);
    }

}
