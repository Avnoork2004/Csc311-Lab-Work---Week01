package org.example;

public class Vehicle {

    //below I wrote the data members
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // default Constructor
    public Vehicle() {
        this.numberOfWheels = 2; // Default value
        this.color = "brown";    // Default value
        this.engineSize = 1.2f;  // Default value
        this.fuelType = "gas"; // Default value
    }

    // parameterized Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    // copy Constructor
    public Vehicle(Vehicle _vehicle) {
        this.numberOfWheels = _vehicle.numberOfWheels;
        this.color = _vehicle.color;
        this.engineSize = _vehicle.engineSize;
        this.fuelType = _vehicle.fuelType;
    }

    // getter num of wheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    //getter color
    public String getColor() {
        return color;
    }

    //getter engine size
    public float getEngineSize() {
        return engineSize;
    }

    //getter fuel type
    public String getFuelType() {
        return fuelType;
    }

    //setter num of wheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    //set color
    public void setColor(String color) {
        this.color = color;
    }

    //set engine size
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }


    //set fuel type
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
