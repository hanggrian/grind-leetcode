from unittest import main

from src.problems101_200.min_stack import MinStack
from tests.sample.sampled_test import SampledTest


class TestMinStack(SampledTest):
    def test(self):
        for sample in self.get_samples():
            stack = None
            for i, move_name in enumerate(sample['input']['moveNames']):
                values = sample['input']['moveValues'][i]
                match move_name:
                    case 'MinStack':
                        stack = MinStack()
                        self.assertIsNone(sample['output'][i])
                        break
                    case 'push':
                        stack.push(values[0])
                        self.assertIsNone(sample['output'][i])
                        break
                    case 'getMininimum':
                        self.assertEqual(
                            sample['output'][i],
                            stack.get_minimum(),
                        )
                        break
                    case 'pop':
                        stack.pop()
                        self.assertIsNone(sample['output'][i])
                        break
                    case 'top':
                        self.assertEqual(
                            sample['output'][i],
                            stack.top(),
                        )
                        break


if __name__ == '__main__':
    main()
