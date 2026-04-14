function isAlnum(c: string): boolean {
  return /[a-z0-9]/i.test(c);
}

export function palindromeCheck(s: string): boolean {
  let left = 0;
  let right = s.length - 1;
  while (left < right) {
    while (left < right && !isAlnum(s[left]!)) left++;
    while (left < right && !isAlnum(s[right]!)) right--;
    if (s[left]!.toLowerCase() !== s[right]!.toLowerCase()) return false;
    left++;
    right--;
  }
  return true;
}
