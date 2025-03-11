import {strictEqual} from "assert";
import SOLUTIONS from "../../src/problems1_100/roman-to-integer";
import getSamples from "../../../testing/js/src/sample/samples";

type Sample = {
  input: {
    s: string,
  },
  output: number,
  message: string,
}

describe(
    'RomanToInteger',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.romanToInt(sample.input.s),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
