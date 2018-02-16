package ooplab9;

public class myCar {
    public static void main(String[] args) {
        Enging engine = new Enging ("1500 cc","V-TEC V4");
        Car car = new Car("Honda","Red",engine);
        System.out.println(car.toString());
    }
}