package com.example.livecoding.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.example.livecoding.slidingwindows.SlidingWindows.lengthOfLongestSubstring;

public class SlidingWindowTest {

    @Test
    void test() {
        assertEquals(0, lengthOfLongestSubstring(null));
        assertEquals(0, lengthOfLongestSubstring(""));
        assertEquals(1, lengthOfLongestSubstring("a"));
        assertEquals(1, lengthOfLongestSubstring("aa"));
        assertEquals(7, lengthOfLongestSubstring("abcdefg"));
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, lengthOfLongestSubstring("abba"));
        assertEquals(3, lengthOfLongestSubstring("abcacbaccccaaaa"));
    }
}