from strings.string_character_frequency import string_character_frequency


def test_simple():
    assert string_character_frequency("aab") == {"a": 2, "b": 1}


def test_empty():
    assert string_character_frequency("") == {}


def test_all_same():
    assert string_character_frequency("aaa") == {"a": 3}


def test_unicode_chars():
    assert string_character_frequency("a a") == {"a": 2, " ": 1}
