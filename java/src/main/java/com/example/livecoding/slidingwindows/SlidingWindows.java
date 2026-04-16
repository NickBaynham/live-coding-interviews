package com.example.livecoding.slidingwindows;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindows {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int left = 0, maxLength = 0;
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (seen.contains(current)) {
                while (seen.contains(current)) {
                    seen.remove(s.charAt(left));
                    left++;
                }
            }
            seen.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
