"""True if two strings are anagrams (same multiset of characters)."""


def valid_anagram(a: str, b: str) -> bool:
    if len(a) != len(b):
        return False
    counts: dict[str, int] = {}
    for c in a:
        counts[c] = counts.get(c, 0) + 1
    for c in b:
        if c not in counts:
            return False
        counts[c] -= 1
        if counts[c] == 0:
            del counts[c]
    return len(counts) == 0
