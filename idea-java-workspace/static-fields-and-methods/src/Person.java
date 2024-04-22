public class Person {

     String name;
     int age;
    static String country;

    static {
        System.out.println("Initializing Static Fields for Person");
        country = "India";
    }

    public static void display(){
        System.out.println("Display() From Person");
    }

    public Person(String name, int age) {
        System.out.println("Person Object Initialized");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country="+ country +
                '}';
    }
}
