package com.company.hw1_6;

public class Test {

    public static void main(String[] args) {

        MyObject myFirstObject = new MyObject();
        myFirstObject.number = 10;
        myFirstObject.text = "text1";

        MyObject mySecondObject = new MyObject();
        mySecondObject.number = 20;
        mySecondObject.text = "text2";

        System.out.println("myFirstObject: number= " + myFirstObject.number + ", text= " + myFirstObject.text);
        System.out.println("mySecondObject: number= " + mySecondObject + "text= " + mySecondObject);

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
                + mySecondObject.STATIC_NUMBER + ","
                + MyObject.STATIC_NUMBER);
        MyObject.STATIC_NUMBER = MyObject.STATIC_NUMBER + 1;

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
                + mySecondObject.STATIC_NUMBER + ","
                + MyObject.STATIC_NUMBER);
    }
}
