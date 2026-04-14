from stacks_queues.queue_using_two_stacks import QueueUsingTwoStacks


def test_fifo_order():
    q = QueueUsingTwoStacks()
    q.push(1)
    q.push(2)
    assert q.peek() == 1
    assert q.pop() == 1
    assert q.peek() == 2


def test_interleaved_push_pop():
    q = QueueUsingTwoStacks()
    q.push(1)
    assert q.pop() == 1
    q.push(2)
    q.push(3)
    assert q.pop() == 2


def test_empty():
    q = QueueUsingTwoStacks()
    assert q.empty() is True
    q.push(1)
    assert q.empty() is False
    q.pop()
    assert q.empty() is True
