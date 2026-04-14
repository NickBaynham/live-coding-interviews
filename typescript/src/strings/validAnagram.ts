export function validAnagram(a: string, b: string): boolean {
  if (a.length !== b.length) return false;
  const counts = new Map<string, number>();
  for (let i = 0; i < a.length; i++) {
    const ca = a[i]!;
    const cb = b[i]!;
    counts.set(ca, (counts.get(ca) ?? 0) + 1);
    counts.set(cb, (counts.get(cb) ?? 0) - 1);
  }
  for (const v of counts.values()) {
    if (v !== 0) return false;
  }
  return true;
}
