package com.company.hw1_6;

public class CarTest {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.brandCar = "Tesla";
        auto.modelCar = "Model3";
        auto.colorCar = "Green";
        auto.powerCar = 777;

        System.out.println("Buying a car:" + "\n"+ auto.brandCar + "\n" + auto.modelCar + "\n" + auto.colorCar + "\n" + auto.powerCar);
    }
}
