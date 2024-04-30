package methodreference;

class Car{
    private String model;
    Car(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
}

interface CarFactory{
    Car createCar(String model);
}


public class ConstructorReference {

    public static void main(String[] args) {

        CarFactory carFactory = Car::new;

        Car car = carFactory.createCar("BMW X3");

        System.out.println(car.getModel());
    }
}
