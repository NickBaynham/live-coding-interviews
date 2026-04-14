package com.example.livecoding.stacksqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QueueUsingTwoStacksTest {

    @Test
    void fifoOrder() {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.push(1);
        q.push(2);
        assertEquals(1, q.peek());
        assertEquals(1, q.pop());
        assertEquals(2, q.peek());
    }

    @Test
    void interleaved() {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.push(1);
        assertEquals(1, q.pop());
        q.push(2);
        q.push(3);
        assertEquals(2, q.pop());
    }

    @Test
    void empty() {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        assertTrue(q.empty());
        q.push(1);
        assertFalse(q.empty());
        q.pop();
        assertTrue(q.empty());
    }
}
