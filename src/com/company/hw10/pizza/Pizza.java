package com.company.hw10.pizza;
/**
 *Клас Pizza шаблон для подальшого створення об'єкту
 */

import com.company.hw10.circle.Circle;

public class Pizza {
    private Circle basis;
    private String composition;
    private String name;
    private int cost;

    public Pizza(String composition, String name, int cost, double diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = new Circle(diameter / 2);
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
