import {strictEqual} from 'assert';
import MinStack from '../../src/problems101_200/min-stack';

describe(
    'MinStack',
    () => {
      test(
          'test',
          () => {
            const stack = new MinStack();
            stack.push(-2);
            stack.push(0);
            stack.push(-3);
            strictEqual(stack.getMinimum(), -3);

            stack.pop();
            strictEqual(stack.top(), 0);
            strictEqual(stack.getMinimum(), -2);
          },
      );
    },
);
