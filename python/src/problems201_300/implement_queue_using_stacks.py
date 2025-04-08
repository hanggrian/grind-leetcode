class ImplementQueueUsingStacks:
    def __init__(self):
        self.pushStack: list[int] = []
        self.popStack: list[int] = []

    def push(self, x: int) -> None:
        self.pushStack.append(x)

    def pop(self) -> int:
        self._fill_pop_stack()
        return self.popStack.pop()

    def peek(self) -> int:
        self._fill_pop_stack()
        return self.popStack[-1]

    def empty(self) -> bool:
        return not self.pushStack and not self.popStack

    def _fill_pop_stack(self) -> None:
        if self.popStack:
            return
        while self.pushStack:
            self.popStack.append(self.pushStack.pop())
