import { describe, expect, it } from "vitest";

import { QueueUsingTwoStacks } from "../src/stacks_queues/queueUsingTwoStacks.js";

describe("QueueUsingTwoStacks", () => {
  it("fifo", () => {
    const q = new QueueUsingTwoStacks();
    q.push(1);
    q.push(2);
    expect(q.peek()).toBe(1);
    expect(q.pop()).toBe(1);
    expect(q.peek()).toBe(2);
  });

  it("interleaved", () => {
    const q = new QueueUsingTwoStacks();
    q.push(1);
    expect(q.pop()).toBe(1);
    q.push(2);
    q.push(3);
    expect(q.pop()).toBe(2);
  });

  it("empty", () => {
    const q = new QueueUsingTwoStacks();
    expect(q.empty()).toBe(true);
    q.push(1);
    expect(q.empty()).toBe(false);
    q.pop();
    expect(q.empty()).toBe(true);
  });
});
