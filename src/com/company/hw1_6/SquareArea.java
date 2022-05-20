package com.company.hw1_6;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int area = x * 2;
        boolean isResult = (area == 8 || area == 4);
        String square = "Периметр равен площади: ";
        System.out.println(square + isResult);
    }
}
