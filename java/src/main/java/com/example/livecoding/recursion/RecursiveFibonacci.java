package com.example.livecoding.recursion;

public final class RecursiveFibonacci {

    private RecursiveFibonacci() {
    }

    public static long recursiveFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
