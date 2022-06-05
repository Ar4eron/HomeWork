package com.company.hw8;

import java.util.Random;

public class Score {
    private String category;
    private double[] statistic;

    {
        statistic = new double[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = new Random().nextDouble(10.00);
        }
    }

    public Score(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String result = category + ": ";
        result = printStatistic(result);
        return result;
    }


    private String printStatistic(String result) {
        String pattern = "%.2f, ";
        for (int i = 0; i < statistic.length; i++) {
            if (i == statistic.length - 1) {
                pattern = "%.2f";
            }
            result += String.format(pattern, statistic[i]);
        }
        return result;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double[] getStatistic() {
        return statistic;
    }

    public void setStatistic(double[] statistic) {
        this.statistic = statistic;
    }
}
