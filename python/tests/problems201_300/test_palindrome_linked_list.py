from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems201_300.palindrome_linked_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPalindromeLinkedList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(SinglyListNode.of(*sample['input']['head'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
