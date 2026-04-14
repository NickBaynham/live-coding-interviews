import pytest

from hash_maps.two_sum import two_sum


def test_example():
    assert two_sum([2, 7, 11, 15], 9) == [0, 1]


def test_another_pair():
    assert two_sum([3, 2, 4], 6) == [1, 2]


def test_duplicate_values():
    nums = [3, 3]
    assert two_sum(nums, 6) == [0, 1]


def test_no_solution_returns_empty():
    assert two_sum([1, 2, 3], 10) == []


def test_empty_list():
    assert two_sum([], 1) == []
