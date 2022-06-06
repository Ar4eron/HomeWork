package com.company.hw10.circle;

/**
 *Circle клас круг
 * calculateCircumferenceAndArea - метод для обчислення окружності та площі.
 */
public class Circle {
    private double radius;
    private double circumference;
    private double area;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        calculateCircumferenceAndArea(radius);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        calculateCircumferenceAndArea(radius);
    }

    private void calculateCircumferenceAndArea(double radius) {
        this.circumference = 2 * radius * Math.PI;
        this.area = Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
