package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // creates new Vehicle object with wheels, color, engine, and fuel type
        Vehicle _vehicle = new Vehicle(4, "purple", 2.3f, "gas");

        // creates new Car object with wheels, color, engine, fuel type, and brand
        org.example.Car car = new org.example.Car(4, "yellow", 3.2f, "diesel", "honda");

        // change color of Vehicle object
        _vehicle.setColor("green");

        // Print updated color of Vehicle object
        System.out.println("Vehicle Color: " + _vehicle.getColor());

        // calls honk method of Car object, prints "Honk, honk!"
        car.honk();

        // displays info of Car object ( brand, num of wheels, color, engine size, and fuel type)
        car.displayInfo();
    }
}