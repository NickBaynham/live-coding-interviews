package com.example.livecoding.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void foundMiddle() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void foundEdges() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 2, 3}, 1));
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 2, 3}, 3));
    }

    @Test
    void notFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void empty() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 1));
    }

    @Test
    void singleMatch() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{7}, 7));
    }

    @Test
    void singleNoMatch() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{7}, 3));
    }
}
