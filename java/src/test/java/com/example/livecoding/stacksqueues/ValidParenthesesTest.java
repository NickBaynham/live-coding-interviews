package com.example.livecoding.stacksqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void validSimple() {
        assertTrue(ValidParentheses.validParentheses("()"));
    }

    @Test
    void validMixed() {
        assertTrue(ValidParentheses.validParentheses("()[]{}"));
    }

    @Test
    void validNested() {
        assertTrue(ValidParentheses.validParentheses("{[]}"));
    }

    @Test
    void invalidOrder() {
        assertFalse(ValidParentheses.validParentheses("(]"));
    }

    @Test
    void invalidInterleaved() {
        assertFalse(ValidParentheses.validParentheses("([)]"));
    }

    @Test
    void empty() {
        assertTrue(ValidParentheses.validParentheses(""));
    }

    @Test
    void onlyOpen() {
        assertFalse(ValidParentheses.validParentheses("((("));
    }
}
