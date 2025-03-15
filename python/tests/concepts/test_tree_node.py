import unittest

from src.concepts.tree_node import TreeNode


class TestSinglyListNode(unittest.TestCase):
    def test_traverse(self):
        node = TreeNode.of(1, 2, 3, 4, 5, 6, 7)
        self.assertEqual(1, node.value)

        left = node.left
        self.assertEqual(2, left.value)

        left = left.left
        self.assertEqual(4, left.value)

        right = node.right
        self.assertEqual(3, right.value)

        right = right.right
        self.assertEqual(7, right.value)


if __name__ == '__main__':
    unittest.main()
