import { describe, expect, it } from "vitest";

import { recursiveFibonacci } from "../src/recursion/recursiveFibonacci.js";

describe("recursiveFibonacci", () => {
  it("base0", () => {
    expect(recursiveFibonacci(0)).toBe(0);
  });

  it("base 1", () => {
    expect(recursiveFibonacci(1)).toBe(1);
  });

  it("small", () => {
    expect(recursiveFibonacci(5)).toBe(5);
    expect(recursiveFibonacci(6)).toBe(8);
  });

  it("negative", () => {
    expect(() => recursiveFibonacci(-1)).toThrow("non-negative");
  });
});
