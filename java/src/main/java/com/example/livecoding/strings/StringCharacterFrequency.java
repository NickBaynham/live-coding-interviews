package com.example.livecoding.strings;

import java.util.HashMap;
import java.util.Map;

public final class StringCharacterFrequency {

    private StringCharacterFrequency() {
    }

    public static Map<Character, Integer> stringCharacterFrequency(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts.merge(c, 1, Integer::sum);
        }
        return counts;
    }
}
