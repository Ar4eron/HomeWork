package com.company.hw8.logistics;

/**
 * Клас Sender відправинки доставки
 * fullName - ім'я відправиника
 * deliveryLocation - місце відправлення
 * weight - вага доставки
 * orderNumber - номер доставки
 */
public class Sender {
    private String fullName;
    private String deliveryLocation;
    private double weight;
    private int orderNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
