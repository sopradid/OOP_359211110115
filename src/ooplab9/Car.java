package ooplab9;

public class Car {
    private String brand;
    private String color;
    private Enging enging; //has-arelation

    public Car(String brand, String color, Enging enging) {
        this.brand = brand;
        this.color = color;
        this.enging = enging;
    }
    //toString
    

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enging=" + enging +
                '}';
    }
    //getter and setter


    public String getBrand() {
        return brand;
    }public void setBrand(String brand) {
        this.brand = brand;
    }public String getColor() {
        return color;
    }public void setColor(String color) {
        this.color = color;
    }public Enging getEnging() {
        return enging;
    }public void setEnging(Enging enging) {
        this.enging = enging;
    }
}