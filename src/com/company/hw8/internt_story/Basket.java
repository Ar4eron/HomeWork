package com.company.hw8.internt_story;

/**
 * Basket - кошик замовлення
 * orderNumber - номер замовлення
 * orderQuantity - кількість продукції замволення
 * orderName - назва продукці
 */
public class Basket {
    private int orderNumber;
    private int orderQuantity;
    private String orderName;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
