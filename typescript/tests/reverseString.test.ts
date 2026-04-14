import { describe, expect, it } from "vitest";

import { reverseString } from "../src/two_pointers/reverseString.js";

describe("reverseString", () => {
  it("happy", () => {
    const chars = "hello".split("");
    reverseString(chars);
    expect(chars.join("")).toBe("olleh");
  });

  it("single", () => {
    const chars = ["a"];
    reverseString(chars);
    expect(chars).toEqual(["a"]);
  });

  it("empty", () => {
    const chars: string[] = [];
    reverseString(chars);
    expect(chars).toEqual([]);
  });

  it("even length", () => {
    const chars = "abcd".split("");
    reverseString(chars);
    expect(chars.join("")).toBe("dcba");
  });
});
