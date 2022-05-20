package com.company.hw1_6;

import java.util.Arrays;

public class ArrayFruits {
    public static void main(String[] args) {
        //Завдання 1
        String[] fruits = {"Apple", "Pineapple", "Banana", "Blackberry", "Cherry",
                "Grape", "Orange", "Melon", "Mango", "Pear"};
        //Завдання 2
        String[] food = Arrays.copyOf(fruits, fruits.length);
        //Завдання 3
        for (String fruit : food) {
            System.out.println(fruit);
        }
        //Завдання 4
        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[] result = new int[3];
        for (int i = 0; i < score.length; i++) {
            sumLine(score, result, i);
        }
        System.out.println(Arrays.toString(result));
    }

    private static void sumLine(int[][] score, int[] result, int line) {
        for (int i = 0; i < score[line].length; i++) {
            result[line] += score[line][i];
        }
    }
}
