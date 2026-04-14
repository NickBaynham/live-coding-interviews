package com.example.livecoding.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    @Test
    void happy() {
        char[] chars = "hello".toCharArray();
        ReverseString.reverseString(chars);
        assertArrayEquals("olleh".toCharArray(), chars);
    }

    @Test
    void single() {
        char[] chars = {'a'};
        ReverseString.reverseString(chars);
        assertArrayEquals(new char[]{'a'}, chars);
    }

    @Test
    void empty() {
        char[] chars = {};
        ReverseString.reverseString(chars);
        assertArrayEquals(new char[]{}, chars);
    }

    @Test
    void evenLength() {
        char[] chars = "abcd".toCharArray();
        ReverseString.reverseString(chars);
        assertArrayEquals("dcba".toCharArray(), chars);
    }
}
