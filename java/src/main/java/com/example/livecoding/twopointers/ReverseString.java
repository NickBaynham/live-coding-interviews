package com.example.livecoding.twopointers;

public final class ReverseString {

    private ReverseString() {
    }

    public static void reverseString(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
            left++;
            right--;
        }
    }
}
