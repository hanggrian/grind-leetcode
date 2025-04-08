from collections import deque
from sys import maxsize


class MinStack:
    def __init__(self):
        self.main: deque[int] = deque()
        self.mins: deque[int] = deque()

    def push(self, value: int):
        self.main.append(value)
        if value <= self.get_minimum():
            self.mins.append(value)

    def get_minimum(self) -> int:
        if len(self.mins) == 0:
            return maxsize
        return self.mins[-1]

    def pop(self) -> None:
        val: int = self.main.pop()
        if val == self.get_minimum():
            self.mins.pop()

    def top(self) -> int:
        return self.main[-1]
