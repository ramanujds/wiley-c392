public class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary=salary;
    }

//    public static void display(){
//        System.out.println("Display() From Employee");
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Country=" + country +
                '}';
    }
}
