package com.company.hw10.pizza;

/**
 *Клас Pizzeria для створення об'єктів по шаблону класу Pizza
 * createPizzas метод для створення об'єктів класу піца
 * printPizzaInfo метод для виведення інформаці по обєктам createPizzas
 */
public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] pizzas = createPizzas();
        for (int i = 0; i < 3; i++) {
            Pizza pizza = pizzas[i];
            printPizzaInfo(pizza);
        }
    }

    private static Pizza[] createPizzas() {
        Pizza cheese = new Pizza("Bread, Cheese", "Cheese", 99, 5);
        Pizza margarita = new Pizza("Bread, Tomato", "Margarita", 10, 10);
        Pizza bayda = new Pizza("Bread, Meat", "Bayda", 65, 7);
        return new Pizza[]{cheese, margarita, bayda};
    }

    private static void printPizzaInfo(Pizza pizza) {
        String format = "Name: %s. Composition: %s. Diameter pizza: %.1f. Cost: %d \n";
        System.out.printf(format, pizza.getName(), pizza.getComposition(), pizza.getBasis().getRadius(), pizza.getCost());
    }
}
