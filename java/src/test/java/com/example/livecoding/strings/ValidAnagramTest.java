package com.example.livecoding.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    @Test
    void trueCase() {
        assertTrue(ValidAnagram.validAnagram("anagram", "nagaram"));
    }

    @Test
    void falseDifferentLengths() {
        assertFalse(ValidAnagram.validAnagram("rat", "car"));
    }

    @Test
    void empty() {
        assertTrue(ValidAnagram.validAnagram("", ""));
    }

    @Test
    void caseMatters() {
        assertFalse(ValidAnagram.validAnagram("a", "A"));
    }
}
