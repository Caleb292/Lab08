package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        list.addCity(edmonton);

        // Calgary is not in the list. should return false
        assertFalse(list.hasCity(calgary));

        // Edmonton is in the list. should return true
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        list.addCity(edmonton);

        // Deleting a city not in list. should throw
        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(calgary));

        // Deleting a city in list. should succeed
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        // Initial list is empty. count = 0
        assertEquals(0, list.countCities());

        // Add Edmonton. count = 1
        list.addCity(edmonton);
        assertEquals(1, list.countCities());

        // Add Calgary. count = 2
        list.addCity(calgary);
        assertEquals(2, list.countCities());

        // Delete Edmonton. count = 1
        list.deleteCity(edmonton);
        assertEquals(1, list.countCities());
    }
}