"""Fibonacci F(0)=0, F(1)=1; naive recursive (for practice only)."""


def recursive_fibonacci(n: int) -> int:
    if n < 0:
        raise ValueError("n must be non-negative")
    if n <= 1:
        return n
    return recursive_fibonacci(n - 1) + recursive_fibonacci(n - 2)
