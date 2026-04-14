export function stringCharacterFrequency(s: string): Record<string, number> {
  const counts: Record<string, number> = {};
  for (const c of s) {
    counts[c] = (counts[c] ?? 0) + 1;
  }
  return counts;
}
