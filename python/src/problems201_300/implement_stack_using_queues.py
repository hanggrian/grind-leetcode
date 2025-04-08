from collections import deque


class ImplementStackUsingQueues:
    def __init__(self):
        self.queue1: deque[int] = deque()
        self.queue2: deque[int] = deque()

    def push(self, x: int) -> None:
        if self.empty():
            self.queue1.append(x)
        elif not self.queue1:
            self.queue2.append(x)
        else:
            self.queue1.append(x)

    def pop(self) -> int:
        primary: deque[int] = self.get_primary()
        secondary: deque[int] = self.get_secondary()
        while len(primary) > 1:
            secondary.append(primary.popleft())
        return primary.popleft()

    def top(self) -> int:
        primary = self.get_primary()
        secondary = self.get_secondary()
        while len(primary) > 1:
            secondary.append(primary.popleft())
        value = primary.popleft()
        secondary.append(value)
        return value

    def empty(self) -> bool:
        return not self.queue1 and not self.queue2

    def get_primary(self) -> deque[int]:
        return self.queue2 if not self.queue1 else self.queue1

    def get_secondary(self) -> deque[int]:
        return self.queue1 if not self.queue1 else self.queue2
