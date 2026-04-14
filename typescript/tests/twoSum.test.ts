import { describe, expect, it } from "vitest";

import { twoSum } from "../src/hash_maps/twoSum.js";

describe("twoSum", () => {
  it("example", () => {
    expect(twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
  });

  it("another pair", () => {
    expect(twoSum([3, 2, 4], 6)).toEqual([1, 2]);
  });

  it("duplicate values", () => {
    expect(twoSum([3, 3], 6)).toEqual([0, 1]);
  });

  it("no solution", () => {
    expect(twoSum([1, 2, 3], 10)).toEqual([]);
  });

  it("empty", () => {
    expect(twoSum([], 1)).toEqual([]);
  });
});
