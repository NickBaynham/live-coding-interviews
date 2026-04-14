/** Indices of two numbers summing to target; empty tuple if none. */
export function twoSum(nums: number[], target: number): [number, number] | [] {
  const indexByValue = new Map<number, number>();
  for (let i = 0; i < nums.length; i++) {
    const need = target - nums[i]!;
    if (indexByValue.has(need)) {
      return [indexByValue.get(need)!, i];
    }
    indexByValue.set(nums[i]!, i);
  }
  return [];
}
