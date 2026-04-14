"""Character counts for a string."""


def string_character_frequency(s: str) -> dict[str, int]:
    counts: dict[str, int] = {}
    for c in s:
        counts[c] = counts.get(c, 0) + 1
    return counts
