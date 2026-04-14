import pytest

from recursion.recursive_fibonacci import recursive_fibonacci


def test_base_zero():
    assert recursive_fibonacci(0) == 0


def test_base_one():
    assert recursive_fibonacci(1) == 1


def test_small():
    assert recursive_fibonacci(5) == 5
    assert recursive_fibonacci(6) == 8


def test_negative_raises():
    with pytest.raises(ValueError):
        recursive_fibonacci(-1)
