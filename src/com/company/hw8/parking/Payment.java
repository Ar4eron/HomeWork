package com.company.hw8.parking;

/**
 * Payment інформація про оплату UserCar
 * time - час перебування UserCar
 */
public class Payment {
   private String nameCard;
   private int numberCar;
   private int time;

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
