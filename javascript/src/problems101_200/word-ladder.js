class Problem {
  ladderLength(beginWord, endWord, wordList) {
    throw new Error(`Not implemented (${beginWord}, ${endWord}, ${wordList}).`);
  }
}

class Default extends Problem {
  ladderLength(beginWord, endWord, wordList) {
    if (!wordList.includes(endWord)) {
      return 0;
    }

    const wordSet = new Set(wordList);

    const queue = [];
    queue.push(beginWord);
    let steps = 0;

    while (queue.length > 0) {
      const size = queue.length;
      for (let i = 0; i < size; i++) {
        const s = queue.shift();
        if (s === endWord) {
          return steps + 1;
        }
        for (let j = 0; j < s.length; j++) {
          const word = s.split('');
          for (let c = 'a'.charCodeAt(0); c <= 'z'.charCodeAt(0); c++) {
            word[j] = String.fromCharCode(c);
            const newWord = word.join('');
            if (s === newWord || !wordSet.has(newWord)) {
              continue;
            }
            queue.push(newWord);
            wordSet.delete(newWord);
          }
        }
      }
      steps++;
    }
    return 0;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
