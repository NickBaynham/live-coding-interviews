from two_pointers.reverse_string import reverse_string


def test_happy():
    chars = list("hello")
    reverse_string(chars)
    assert chars == list("olleh")


def test_single():
    chars = ["a"]
    reverse_string(chars)
    assert chars == ["a"]


def test_empty():
    chars: list[str] = []
    reverse_string(chars)
    assert chars == []


def test_even_length():
    chars = list("abcd")
    reverse_string(chars)
    assert chars == list("dcba")
