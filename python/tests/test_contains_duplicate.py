from arrays.contains_duplicate import contains_duplicate


def test_has_duplicate():
    assert contains_duplicate([1, 2, 3, 1]) is True


def test_all_unique():
    assert contains_duplicate([1, 2, 3, 4]) is False


def test_empty():
    assert contains_duplicate([]) is False


def test_single():
    assert contains_duplicate([42]) is False
