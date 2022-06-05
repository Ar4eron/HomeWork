package com.company.hw9.car;

import java.util.Arrays;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private Wheel[] wheels;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n engine=" + engine +
                ",\n transmission=" + transmission +
                ",\n wheels=" + Arrays.toString(wheels) +
                '}';
    }
}