package com.company.hw8.logistics;

/**
 * Клас Recipient отримувач доставки
 * fullName - ім'я отримувача
 * placeOfRecipient - місце отримання замовлення
 * orderNumber - номер замовлення
 * shippingCost - варітсь доставки
 */
public class Recipient {
    private String fullName;
    private String placeOfReceipt;
    private int orderNumber;
    private double shippingCost;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPlaceOfReceipt() {
        return placeOfReceipt;
    }

    public void setPlaceOfReceipt(String placeOfReceipt) {
        this.placeOfReceipt = placeOfReceipt;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
