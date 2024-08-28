package org.example;

public class Car extends Vehicle {

    //below I wrote the data member brand
    private String brand;

    // default Constructor
    public Car() {
        super(); // Calls the default constructor of vehicle
        this.brand = "N/A"; // default value for brand
    }

    // parameterized Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType); // calls parameterized constructor of Vehicle
        this.brand = brand;
    }

    // copy Constructor
    public Car(Car car) {
        super(car.getNumberOfWheels(), car.getColor(), car.getEngineSize(), car.getFuelType()); // calls parameterized constructor of Vehicle with Car's attributes
        this.brand = car.brand;
    }

    // getter brand
    public String getBrand() {
        return brand;
    }

    //setter brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // method prints honk
    public void honk() {
        System.out.println("Honk, honk!");
    }

    //show car info
    public void displayInfo() {
        System.out.println("brand: " + brand);
        System.out.println("num of wheels: " + getNumberOfWheels());
        System.out.println("color: " + getColor());
        System.out.println("engine size: " + getEngineSize());
        System.out.println("fuel type: " + getFuelType());
    }
}
