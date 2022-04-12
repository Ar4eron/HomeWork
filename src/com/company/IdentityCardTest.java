package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard identityCard = new IdentityCard();
        identityCard.nation = "USA";
        identityCard.firstName = "Jon";
        identityCard.lastName = "Juk";
        identityCard.personalCode = 321_654_879;

        System.out.println(identityCard.nation + ", " + identityCard.firstName + " " + identityCard.lastName + ", " + identityCard.personalCode);
    }
}
