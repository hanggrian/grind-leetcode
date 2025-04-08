from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems101_200.intersection_of_two_linked_lists import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestIntersectionOfTwoLinkedLists(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                list_a = SinglyListNode.of(*sample['input']['listA'])
                list_b = SinglyListNode.of(*sample['input']['listB'])
                if sample['input']['intersectVal'] < 1:
                    self.assertIsNone(
                        solution.get_intersection_node(list_a, list_b),
                        sample['message'],
                    )
                    continue
                list_a.iterate_to(sample['input']['skipA'] - 1).next = \
                    list_b.iterate_to(sample['input']['skipB'] - 1)
                self.assertIsNotNone(
                    solution.get_intersection_node(list_a, list_b),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
