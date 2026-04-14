package com.example.livecoding.strings;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCharacterFrequencyTest {

    @Test
    void simple() {
        Map<Character, Integer> m = StringCharacterFrequency.stringCharacterFrequency("aab");
        assertEquals(2, m.get('a'));
        assertEquals(1, m.get('b'));
        assertEquals(2, m.size());
    }

    @Test
    void empty() {
        assertTrue(StringCharacterFrequency.stringCharacterFrequency("").isEmpty());
    }

    @Test
    void allSame() {
        Map<Character, Integer> m = StringCharacterFrequency.stringCharacterFrequency("aaa");
        assertEquals(3, m.get('a'));
    }
}
