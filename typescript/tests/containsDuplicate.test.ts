import { describe, expect, it } from "vitest";

import { containsDuplicate } from "../src/arrays/containsDuplicate.js";

describe("containsDuplicate", () => {
  it("has duplicate", () => {
    expect(containsDuplicate([1, 2, 3, 1])).toBe(true);
  });

  it("all unique", () => {
    expect(containsDuplicate([1, 2, 3, 4])).toBe(false);
  });

  it("empty", () => {
    expect(containsDuplicate([])).toBe(false);
  });

  it("single", () => {
    expect(containsDuplicate([42])).toBe(false);
  });
});
