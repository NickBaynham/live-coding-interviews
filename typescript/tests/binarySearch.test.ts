import { describe, expect, it } from "vitest";

import { binarySearch } from "../src/arrays/binarySearch.js";

describe("binarySearch", () => {
  it("middle", () => {
    expect(binarySearch([1, 2, 3, 4, 5], 3)).toBe(2);
  });

  it("edges", () => {
    expect(binarySearch([1, 2, 3], 1)).toBe(0);
    expect(binarySearch([1, 2, 3], 3)).toBe(2);
  });

  it("not found", () => {
    expect(binarySearch([1, 2, 3, 4], 5)).toBe(-1);
  });

  it("empty", () => {
    expect(binarySearch([], 1)).toBe(-1);
  });

  it("single match", () => {
    expect(binarySearch([7], 7)).toBe(0);
  });

  it("single miss", () => {
    expect(binarySearch([7], 3)).toBe(-1);
  });
});
