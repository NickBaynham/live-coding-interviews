package com.example.livecoding.arrays;

import java.util.HashSet;
import java.util.Set;

public final class ContainsDuplicate {

    private ContainsDuplicate() {
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}
