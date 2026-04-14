import { describe, expect, it } from "vitest";

import { validParentheses } from "../src/stacks_queues/validParentheses.js";

describe("validParentheses", () => {
  it("simple", () => {
    expect(validParentheses("()")).toBe(true);
  });

  it("mixed", () => {
    expect(validParentheses("()[]{}")).toBe(true);
  });

  it("nested", () => {
    expect(validParentheses("{[]}")).toBe(true);
  });

  it("invalid order", () => {
    expect(validParentheses("(]")).toBe(false);
  });

  it("interleaved", () => {
    expect(validParentheses("([)]")).toBe(false);
  });

  it("empty", () => {
    expect(validParentheses("")).toBe(true);
  });

  it("only open", () => {
    expect(validParentheses("(((")).toBe(false);
  });
});
