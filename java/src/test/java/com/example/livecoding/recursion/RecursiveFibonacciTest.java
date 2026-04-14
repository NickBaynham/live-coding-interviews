package com.example.livecoding.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecursiveFibonacciTest {

    @Test
    void baseZero() {
        assertEquals(0, RecursiveFibonacci.recursiveFibonacci(0));
    }

    @Test
    void baseOne() {
        assertEquals(1, RecursiveFibonacci.recursiveFibonacci(1));
    }

    @Test
    void small() {
        assertEquals(5, RecursiveFibonacci.recursiveFibonacci(5));
        assertEquals(8, RecursiveFibonacci.recursiveFibonacci(6));
    }

    @Test
    void negative() {
        assertThrows(IllegalArgumentException.class, () -> RecursiveFibonacci.recursiveFibonacci(-1));
    }
}
