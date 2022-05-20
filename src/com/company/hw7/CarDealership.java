package com.company.hw7;

import java.util.Random;

public class CarDealership {
    public static void main(String[] args) {

        Customer customer = createCustomer();
        if (customer.getAge() <= 18) {
            System.out.println(customer.getFullName() + ", прийдіть через " + (18 - customer.getAge()) + " років.");
            return;
        }

        Car car = createCar();
        if (ifCustomerHasEnoughMoney(customer, car)) {
            congratulationsForBuyCar(car, customer);
            return;
        }

        offerCredit(customer, car);
    }

    private static void offerCredit(Customer customer, Car car) {
        if (customer.isReadyForCredit()) {
            applyThreeYearCredit(car.getPrice());
            congratulationsForBuyCar(car, customer);
        } else {
            System.out.println(customer.getFullName() + ", приходьте пізніше, Ви не придбали авто.");
        }
    }

    private static Car createCar() {
        Car car = new Car();
        car.setName("BMW");
        car.setPrice(new Random().nextInt(99999999));
        return car;
    }

    private static Customer createCustomer() {
        Customer customer = new Customer();
        customer.setFullName("Алекс Ванюшка");
        customer.setAge(new Random().nextInt(99));
        customer.setCash(new Random().nextInt(99999999));
        customer.setReadyForCredit(new Random().nextBoolean());
        return customer;
    }

    private static boolean ifCustomerHasEnoughMoney(Customer customer, Car car) {
        return customer.getCash() >= car.getPrice();
    }

    private static void congratulationsForBuyCar(Car car, Customer customer) {
        System.out.println(customer.getFullName() + ", Ви придбали " + car.getName() + "!");
    }

    private static void applyThreeYearCredit(int price) {
        System.out.println(price / 36 + " грн місячний платіж по кредиту.");
    }
}