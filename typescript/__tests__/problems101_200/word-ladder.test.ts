import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/word-ladder';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    beginWord: string,
    endWord: string,
    wordList: string[],
  },
  output: number,
  message: string,
}

describe(
    'WordLadder',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.ladderLength(
                          sample.input.beginWord,
                          sample.input.endWord,
                          sample.input.wordList,
                      ),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
