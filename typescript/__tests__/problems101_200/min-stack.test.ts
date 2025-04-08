import {strictEqual} from 'assert';
import MinStack from '../../src/problems101_200/min-stack';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    moveNames: string[],
    moveValues: number[][],
  },
  output: number[],
  message: string,
}

describe(
    'MinStack',
    () =>
        test(
            'test',
            () =>
                getSamples().forEach((sample: Sample) => {
                  let stack = undefined;
                  for (let i = 0; i < sample.input.moveNames.length; i++) {
                    let values = sample.input.moveValues[i];
                    switch (sample.input.moveNames[i]) {
                      case 'MinStack':
                        stack = new MinStack();
                        strictEqual(null, sample.output[i]);
                        break;
                      case 'push':
                        stack.push(values[0]);
                        strictEqual(null, sample.output[i]);
                        break;
                      case 'getMininimum':
                        strictEqual(stack.getMinimum(), sample.output[i]);
                        break;
                      case 'pop':
                        stack.pop();
                        strictEqual(null, sample.output[i]);
                        break;
                      case 'top':
                        strictEqual(stack.top(), sample.output[i]);
                        break;
                    }
                  }
                }),
        ),
);
