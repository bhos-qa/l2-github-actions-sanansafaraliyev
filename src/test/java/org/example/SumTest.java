package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SumTest {
    @Test
    void sumNumbers() {
        int a = 50;
        int b = 150;
        assertEquals(200, Main.sum(a, b));
    }
}