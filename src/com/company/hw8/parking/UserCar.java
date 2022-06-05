package com.company.hw8.parking;

/**
 * UserCar - іноформація про авто користувача парковки
 * auto - назва авто
 * licensePlate - номерний знак
 */
public class UserCar {
   private String auto;
   private String licensePlate;

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
