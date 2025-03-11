from unittest import TestCase, main

from src.problems101_200.min_stack import MinStack


class TestMinStack(TestCase):
    def test(self):
        stack = MinStack()
        stack.push(-2)
        stack.push(0)
        stack.push(-3)
        self.assertEqual(-3, stack.get_minimum())

        stack.pop()
        self.assertEqual(0, stack.top())
        self.assertEqual(-2, stack.get_minimum())


if __name__ == '__main__':
    main()
