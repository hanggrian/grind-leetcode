from unittest import main

from src.problems201_300.implement_queue_using_stacks import ImplementQueueUsingStacks
from tests.sample.sampled_test import SampledTest


class TestImplementQueueUsingStacks(SampledTest):
    def test(self):
        for sample in self.get_samples():
            queue = None
            for i in range(len(sample['input']['moveNames'])):
                values = sample['input']['moveValues'][i]
                match sample['input']['moveNames'][i]:
                    case 'MyQueue':
                        queue = ImplementQueueUsingStacks()
                        self.assertIsNone(sample['output'][i])
                    case 'push':
                        queue.push(values[0])
                        self.assertIsNone(sample['output'][i])
                    case 'peek':
                        self.assertEqual(sample['output'][i], queue.peek())
                    case 'pop':
                        self.assertEqual(sample['output'][i], queue.pop())
                    case 'empty':
                        self.assertEqual(sample['output'][i], queue.empty())


if __name__ == '__main__':
    main()
