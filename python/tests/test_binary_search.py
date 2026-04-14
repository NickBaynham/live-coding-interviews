from arrays.binary_search import binary_search


def test_found_middle():
    assert binary_search([1, 2, 3, 4, 5], 3) == 2


def test_found_edges():
    assert binary_search([1, 2, 3], 1) == 0
    assert binary_search([1, 2, 3], 3) == 2


def test_not_found():
    assert binary_search([1, 2, 3, 4], 5) == -1


def test_empty():
    assert binary_search([], 1) == -1


def test_single_match():
    assert binary_search([7], 7) == 0


def test_single_no_match():
    assert binary_search([7], 3) == -1
