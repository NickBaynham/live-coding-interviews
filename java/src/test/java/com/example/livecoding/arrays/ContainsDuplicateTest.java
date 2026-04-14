package com.example.livecoding.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void hasDuplicate() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void allUnique() {
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void empty() {
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{}));
    }

    @Test
    void single() {
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{42}));
    }
}
