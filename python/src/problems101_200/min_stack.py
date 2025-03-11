from collections import deque
from sys import maxsize


class MinStack:
    def __init__(self):
        self.main = deque()
        self.mins = deque()

    def push(self, val):
        self.main.append(val)
        if val <= self.get_minimum():
            self.mins.append(val)

    def get_minimum(self):
        if len(self.mins) == 0:
            return maxsize
        return self.mins[-1]

    def pop(self):
        val = self.main.pop()
        if val == self.get_minimum():
            self.mins.pop()

    def top(self):
        return self.main[-1]
