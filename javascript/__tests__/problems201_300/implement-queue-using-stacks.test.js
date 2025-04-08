import {strictEqual} from 'assert';
import getSamples from '../../../testing/js/src/sample/samples';
import ImplementQueueUsingStacks from '../../src/problems201_300/implement-queue-using-stacks';

describe(
    'ImplementQueueUsingStacks',
    () =>
        test(
            'test',
            () =>
                getSamples().forEach(sample => {
                  let queue = undefined;
                  for (let i = 0; i < sample.input.moveNames.length; i++) {
                    const values = sample.input.moveValues[i];
                    switch (sample.input.moveNames[i]) {
                      case 'MyQueue':
                        queue = new ImplementQueueUsingStacks();
                        strictEqual(sample.output[i], null);
                        break;
                      case 'push':
                        queue.push(values[0]);
                        strictEqual(sample.output[i], null);
                        break;
                      case 'peek':
                        strictEqual(sample.output[i], queue.peek());
                        break;
                      case 'pop':
                        strictEqual(sample.output[i], queue.pop());
                        break;
                      case 'empty':
                        strictEqual(sample.output[i], queue.empty());
                        break;
                    }
                  }
                }),
        ),
);
