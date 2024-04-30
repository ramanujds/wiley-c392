package generics;

public class GenericClass<T> {

    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return  this.value;
    }

    public static void main(String[] args) {
        GenericClass <Integer> obj1 = new GenericClass<>();

        GenericClass <String> obj2 = new GenericClass<>();

        obj1.setValue(10);
        System.out.println(obj1.getValue());


        obj2.setValue("Hello");
        System.out.println(obj2.getValue());
    }

}
