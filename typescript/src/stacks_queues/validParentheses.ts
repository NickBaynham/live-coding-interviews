const PAIRS: Record<string, string> = { ")": "(", "]": "[", "}": "{" };

export function validParentheses(s: string): boolean {
  const stack: string[] = [];
  for (const c of s) {
    if ("([{".includes(c)) {
      stack.push(c);
    } else if (c in PAIRS) {
      if (!stack.length || stack.pop() !== PAIRS[c]) return false;
    } else {
      return false;
    }
  }
  return stack.length === 0;
}
