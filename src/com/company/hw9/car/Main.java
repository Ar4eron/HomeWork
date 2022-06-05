package com.company.hw9.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(createEngine());
        car.setTransmission(createTransmission());
        car.setWheels(createWheels());
        System.out.println(car);
    }

    private static Wheel[] createWheels() {
        Wheel[] wheels = new Wheel[4];
        int radius = 21;
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheel.setRadius(radius);
            wheels[i] = wheel;
        }
        return wheels;
    }

    private static Transmission createTransmission() {
        Transmission transmission = new Transmission();
        transmission.setName("Mazda");
        transmission.setAutomatic(true);
        return transmission;
    }

    private static Engine createEngine() {
        Engine engine = new Engine();
        engine.setName("Toyota 1JZ");
        engine.setPower(999);
        return engine;
    }
}
