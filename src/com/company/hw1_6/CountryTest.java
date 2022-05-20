package com.company.hw1_6;

public class CountryTest {
    public static void main(String[] args) {

        Country country = new Country();
        country.nameCountry = "USA";
        country.capital = "Washington";
        country.areaCountry = 9_826_675;
        country.population = 328_915_700;

        System.out.print(country.nameCountry + ", " + country.capital + ", " + country.areaCountry + " km, " + country.population + " pop.");
    }
}
