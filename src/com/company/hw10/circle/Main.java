package com.company.hw10.circle;

/**
 * Main клас створення для об'єкта круг
 * і виведення інформації по ньому
 */
public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle(2, "Red");
        System.out.println("Radius: " + redCircle.getRadius());
        System.out.println("Area: " + redCircle.getArea());
        System.out.println("Circumference: " + redCircle.getCircumference());
        System.out.println("Color: " + redCircle.getColor());
    }
}
