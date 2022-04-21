package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1

        for (int i = 0; i <= 100; i++) {
            if (i == 13 || i == 66)
                continue;
            System.out.println(i);
        }

        //        Задание 2

        int numb = 1;
        for (int j = 0; j <= 100; j++, numb++) {
            numb *= j;
            if (numb >= 1000)
                break;
            System.out.println(numb);
        }
        System.out.println(numb);

        //Задание 3

        CreditCard creditCard = new CreditCard();
        creditCard.type = "UnionPay";
        creditCard.cardNumber = "3214_9785_6548_9874";
        creditCard.owner = "Alex";
        switch (creditCard.type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Ув. " + creditCard.owner + " поздравляем, вы используете нормальную карту.");
                break;
            case "МИР":
                System.out.println(creditCard.owner + " пошел ты на х#й вместе со своим русским кораблем!!");
                break;
            default:
                System.out.println("Неизвестный тип карты: " + creditCard.type);
        }
    }
}
