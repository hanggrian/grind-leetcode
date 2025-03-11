import {strictEqual} from "assert";
import SOLUTIONS from "../../src/problems1_100/roman-to-integer";
import getSamples from "../../../testing/js/src/sample/samples";

describe(
    'RomanToInteger',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
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
