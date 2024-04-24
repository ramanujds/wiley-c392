package utildate;

class Address{
    private String address;
    public Address(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}

final class Person{
    private String name;
    private int age;
    private Address address;



    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address=address;
    }

    public Address getAddress(){
        return address;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.getAddress() +
                '}';
    }
}

class PersonManager{
    public void changePersonName(Person person, String name){
        person = null;
    }
}

public class PassByExample {


    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Person person = new Person("Harsh",25, new Address("Bangalore"));
        System.out.println(person);
       person.getAddress().setAddress("Delhi");

        System.out.println(person);


    }

}
