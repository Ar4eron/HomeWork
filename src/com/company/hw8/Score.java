package com.company.hw8;

public class Score {
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

    private String category;
    private double [] statistic;
}
