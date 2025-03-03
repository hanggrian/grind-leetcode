import {strictEqual} from "assert";

import {SOLUTIONS} from "../../src/problems1_100/roman-to-integer";
import getSamples from "../../../testing/js/src/sample/samples";

describe(
  'RomanToInteger',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.romanToInt(sample.input.s),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
