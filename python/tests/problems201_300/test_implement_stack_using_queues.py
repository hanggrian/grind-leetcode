from unittest import main

from src.problems201_300.implement_stack_using_queues import ImplementStackUsingQueues
from tests.sample.sampled_test import SampledTest


class TestImplementStackUsingQueues(SampledTest):
    def test(self):
        for sample in self.get_samples():
            stack = None
            for i in range(len(sample['input']['moveNames'])):
                values = sample['input']['moveValues'][i]
                match sample['input']['moveNames'][i]:
                    case 'MyStack':
                        stack = ImplementStackUsingQueues()
                        self.assertIsNone(sample['output'][i])
                    case 'push':
                        stack.push(values[0])
                        self.assertIsNone(sample['output'][i])
                    case 'top':
                        self.assertEqual(sample['output'][i], stack.top())
                    case 'pop':
                        self.assertEqual(sample['output'][i], stack.pop())
                    case 'empty':
                        self.assertEqual(sample['output'][i], stack.empty())


if __name__ == '__main__':
    main()
