import { describe, expect, it } from "vitest";

import { validAnagram } from "../src/strings/validAnagram.js";

describe("validAnagram", () => {
  it("true", () => {
    expect(validAnagram("anagram", "nagaram")).toBe(true);
  });

  it("false", () => {
    expect(validAnagram("rat", "car")).toBe(false);
  });

  it("empty", () => {
    expect(validAnagram("", "")).toBe(true);
  });

  it("case sensitive", () => {
    expect(validAnagram("a", "A")).toBe(false);
  });
});
