from strings.palindrome_check import palindrome_check


def test_simple():
    assert palindrome_check("racecar") is True


def test_with_spaces_and_punctuation():
    assert palindrome_check("A man, a plan, a canal: Panama") is True


def test_not_palindrome():
    assert palindrome_check("robot") is False


def test_empty():
    assert palindrome_check("") is True


def test_mixed_case_ignored():
    assert palindrome_check("Aa") is True
