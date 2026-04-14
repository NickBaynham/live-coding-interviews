package com.example.livecoding.hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void example() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void anotherPair() {
        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void noSolution() {
        assertArrayEquals(new int[]{}, TwoSum.twoSum(new int[]{1, 2, 3}, 10));
    }

    @Test
    void empty() {
        assertArrayEquals(new int[]{}, TwoSum.twoSum(new int[]{}, 1));
    }
}
