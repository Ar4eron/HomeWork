package com.company.hw7;

public class Customer {
    private String fullName;
    private int age;
    private int cash;
    private boolean isReadyForCredit;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean isReadyForCredit() {
        return isReadyForCredit;
    }

    public void setReadyForCredit(boolean readyForCredit) {
        isReadyForCredit = readyForCredit;
    }

}
