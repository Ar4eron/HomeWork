package com.company;

public class Transformation {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        double e = 5.5;
        float f = 6.6F;
        char g = '7';

        System.out.println("B long z byte: " + (a + b + c + d));
        System.out.println("B double z int: " + (c + e));
        System.out.println("B double z short: " + (b + f + e));
        System.out.println("B int z char: " + (g + c));

        int maxInt = 2_147_483_647;
        float tran = (float) maxInt;
        System.out.println("Z int v float: " + maxInt + tran);

        byte maxByte = 127;
        System.out.println("byte переполнения: " + ++maxByte);
    }
}
