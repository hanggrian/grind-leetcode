import unittest

from src.concepts.list_nodes import SinglyListNode, SINGLY_LIST_NODE_ZERO


class TestSinglyListNode(unittest.TestCase):
    def test_sum(self):
        total = 0
        for n in SINGLY_LIST_NODE_ZERO:
            total += n.value
        self.assertEqual(0, total)

        total = 0
        for n in SinglyListNode.of(1, 3, 5, 7):
            total += n.value
        self.assertEqual(16, total)

    def test_traverse(self):
        node = SinglyListNode.of(2, 4, 6, 8)
        self.assertEqual(2, node.value)
        node = node.next.next
        self.assertEqual(6, node.value)
        node = node.next
        self.assertEqual(8, node.value)


if __name__ == '__main__':
    unittest.main()
