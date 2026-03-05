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

        // Calgary is not in the list → should return false
        assertFalse(list.hasCity(calgary));

        // Edmonton is in the list → should return true
        assertTrue(list.hasCity(edmonton));
    }
}
