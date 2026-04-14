"""Return True if any value appears at least twice."""


def contains_duplicate(nums: list[int]) -> bool:
    seen: set[int] = set()
    for n in nums:
        if n in seen:
            return True
        seen.add(n)
    return False
