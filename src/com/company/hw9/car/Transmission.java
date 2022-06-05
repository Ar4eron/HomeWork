package com.company.hw9.car;

public class Transmission {
    private String name;
    private boolean automatic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                ", automatic=" + automatic +
                '}';
    }
}
