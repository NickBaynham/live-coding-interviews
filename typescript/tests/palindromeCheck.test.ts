import { describe, expect, it } from "vitest";

import { palindromeCheck } from "../src/strings/palindromeCheck.js";

describe("palindromeCheck", () => {
  it("simple", () => {
    expect(palindromeCheck("racecar")).toBe(true);
  });

  it("with punctuation", () => {
    expect(palindromeCheck("A man, a plan, a canal: Panama")).toBe(true);
  });

  it("not palindrome", () => {
    expect(palindromeCheck("robot")).toBe(false);
  });

  it("empty", () => {
    expect(palindromeCheck("")).toBe(true);
  });

  it("mixed case", () => {
    expect(palindromeCheck("Aa")).toBe(true);
  });
});
