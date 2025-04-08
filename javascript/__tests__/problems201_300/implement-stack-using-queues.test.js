import {strictEqual} from 'assert';
import getSamples from '../../../testing/js/src/sample/samples';
import ImplementStackUsingQueues from '../../src/problems201_300/implement-stack-using-queues';

describe(
    'ImplementStackUsingQueues',
    () =>
        test(
            'test',
            () =>
                getSamples().forEach(sample => {
                  let stack = undefined;
                  for (let i = 0; i < sample.input.moveNames.length; i++) {
                    const values = sample.input.moveValues[i];
                    switch (sample.input.moveNames[i]) {
                      case 'MyStack':
                        stack = new ImplementStackUsingQueues();
                        strictEqual(sample.output[i], null);
                        break;
                      case 'push':
                        stack.push(values[0]);
                        strictEqual(sample.output[i], null);
                        break;
                      case 'top':
                        strictEqual(sample.output[i], stack.top());
                        break;
                      case 'pop':
                        strictEqual(sample.output[i], stack.pop());
                        break;
                      case 'empty':
                        strictEqual(sample.output[i], stack.empty());
                        break;
                    }
                  }
                }),
        ),
);
