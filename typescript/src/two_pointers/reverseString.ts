/** Reverses array of single-character strings in place (two pointers). */
export function reverseString(chars: string[]): void {
  let left = 0;
  let right = chars.length - 1;
  while (left < right) {
    const t = chars[left]!;
    chars[left] = chars[right]!;
    chars[right] = t;
    left++;
    right--;
  }
}
