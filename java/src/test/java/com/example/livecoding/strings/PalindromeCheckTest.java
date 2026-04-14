package com.example.livecoding.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckTest {

    @Test
    void simple() {
        assertTrue(PalindromeCheck.palindromeCheck("racecar"));
    }

    @Test
    void withSpacesAndPunctuation() {
        assertTrue(PalindromeCheck.palindromeCheck("A man, a plan, a canal: Panama"));
    }

    @Test
    void notPalindrome() {
        assertFalse(PalindromeCheck.palindromeCheck("robot"));
    }

    @Test
    void empty() {
        assertTrue(PalindromeCheck.palindromeCheck(""));
    }

    @Test
    void mixedCaseIgnored() {
        assertTrue(PalindromeCheck.palindromeCheck("Aa"));
    }
}
