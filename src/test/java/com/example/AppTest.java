
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void addTwoNumbers() {
        assertEquals(29, App.add(10, 5));
    }
}
