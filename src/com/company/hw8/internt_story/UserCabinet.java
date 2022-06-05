package com.company.hw8.internt_story;

/**
 * UserCabinet - інформаці про замовника в інтернет-магазниі
 * fullName - ім'я замовника
 * card - інформація про карту замонвика
 * bounce - бонуси замовника
 * deliveryLocation - місце достаква замовнику
 */
public class UserCabinet {
    private String fullName;
    private String card;
    private double bounce;
    private String deliveryLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}
