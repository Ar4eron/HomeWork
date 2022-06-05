package com.company.hw8;

public class GlobalRating {
    private static Score[] data;

     static {
        data = new Score[4];
        data[0] = new Score("views");
        data[1] = new Score("actions");
        data[2] = new Score("sharings");
        data[3] = new Score("buyings");
    }

    public static Score[] getData() {
        return data;
    }

    public static void setData(Score[] data) {
        GlobalRating.data = data;
    }
}
