import { describe, expect, it } from "vitest";

import { stringCharacterFrequency } from "../src/strings/stringCharacterFrequency.js";

describe("stringCharacterFrequency", () => {
  it("simple", () => {
    expect(stringCharacterFrequency("aab")).toEqual({ a: 2, b: 1 });
  });

  it("empty", () => {
    expect(stringCharacterFrequency("")).toEqual({});
  });

  it("all same", () => {
    expect(stringCharacterFrequency("aaa")).toEqual({ a: 3 });
  });

  it("space", () => {
    expect(stringCharacterFrequency("a a")).toEqual({ a: 2, " ": 1 });
  });
});
