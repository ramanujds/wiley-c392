package methodreference;

class Person{
    private int age;
    public Person(int age){
        this.age=age;
    }
    public boolean isAdult(){
        return age>=18;
    }
}

interface AgeChecker{
    boolean checkAge(Person person);
}

public class InstanceMethodReference {

    public static void main(String[] args) {

        Person person = new Person(15);
        AgeChecker ageChecker = Person::isAdult;
        System.out.println(ageChecker.checkAge(person));

    }
}
