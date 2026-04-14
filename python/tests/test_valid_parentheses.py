from stacks_queues.valid_parentheses import valid_parentheses


def test_valid_simple():
    assert valid_parentheses("()") is True


def test_valid_mixed():
    assert valid_parentheses("()[]{}") is True


def test_valid_nested():
    assert valid_parentheses("{[]}") is True


def test_invalid_order():
    assert valid_parentheses("(]") is False


def test_unclosed():
    assert valid_parentheses("([)]") is False


def test_empty():
    assert valid_parentheses("") is True


def test_only_open():
    assert valid_parentheses("(((") is False
