package com.company.hw8.logistics;

/**
 *Клас Delivery доставку від Sender до Recipient
 * senderPlace - місце відправки
 * recipientPlace - місце отримання
 * orderNumber - номер замовлення
 * shippingForm - форма доставка
 */
public class Delivery {
    private String senderPlace;
    private String recipientPlace;
    private int orderNumber;
    private String shippingForm;

    public String getSenderPlace() {
        return senderPlace;
    }

    public void setSenderPlace(String senderPlace) {
        this.senderPlace = senderPlace;
    }

    public String getRecipientPlace() {
        return recipientPlace;
    }

    public void setRecipientPlace(String recipientPlace) {
        this.recipientPlace = recipientPlace;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getShippingForm() {
        return shippingForm;
    }

    public void setShippingForm(String shippingForm) {
        this.shippingForm = shippingForm;
    }
}
