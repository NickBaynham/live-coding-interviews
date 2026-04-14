from strings.valid_anagram import valid_anagram


def test_true():
    assert valid_anagram("anagram", "nagaram") is True


def test_false_different_lengths():
    assert valid_anagram("rat", "car") is False


def test_empty():
    assert valid_anagram("", "") is True


def test_case_sensitive_distinct():
    assert valid_anagram("a", "A") is False
