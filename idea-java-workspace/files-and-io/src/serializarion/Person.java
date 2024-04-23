package serializarion;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 131435146146156151L;

    private String name;
    private String city;
    private int age;
    private transient String password;

    public Person(){ }

    public Person(String name, String city, int age, String password) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
                ", city='" + city + '\'' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }
}
