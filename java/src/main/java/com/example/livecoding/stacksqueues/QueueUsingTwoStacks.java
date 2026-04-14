package com.example.livecoding.stacksqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingTwoStacks {

    private final Deque<Integer> in = new ArrayDeque<>();
    private final Deque<Integer> out = new ArrayDeque<>();

    public void push(int x) {
        in.push(x);
    }

    private void pour() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }

    public int pop() {
        pour();
        return out.pop();
    }

    public int peek() {
        pour();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
