public class MainProgram {

    static {
        System.out.println("Setting up the Program");
    }

    public static void main(String[] args) {
        System.out.println("Program execution started");
        Employee p1 = new Employee("Karan",25,56000);
        Employee.display();
        //Person.country = "India";
        Person p2 = new Person("Mohit",28);
        System.out.println(p1);
        System.out.println(p2);

    }

}
