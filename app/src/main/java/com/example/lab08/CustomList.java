package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Check number of cities
     * @param city
     * @return
     */
     public boolean hasCity(City city) {
         return cities.contains(city);
     }

     public void deleteCity(City city) {
         if (!cities.remove(city)) {
             throw new IllegalArgumentException("City not in list");
         }
     }

    public int countCities() {
        return cities.size();
    }
}
