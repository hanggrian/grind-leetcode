class Problem {
  ladderLength(beginWord: string, endWord: string, wordList: string[]): number {
    throw new Error(`Not implemented (${beginWord}, ${endWord}, ${wordList}).`);
  }
}

class Default extends Problem {
  ladderLength(beginWord: string, endWord: string, wordList: string[]): number {
    if (!wordList.includes(endWord)) {
      return 0;
    }

    const wordSet: Set<string> = new Set(wordList);

    const queue: string[] = [];
    queue.push(beginWord);
    let steps = 0;

    while (queue.length > 0) {
      const size: number = queue.length;
      for (let i = 0; i < size; i++) {
        const s: string = queue.shift();
        if (s === endWord) {
          return steps + 1;
        }
        for (let j = 0; j < s.length; j++) {
          const word: string[] = s.split('');
          for (let c = 'a'.charCodeAt(0); c <= 'z'.charCodeAt(0); c++) {
            word[j] = String.fromCharCode(c);
            const newWord: string = word.join('');
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
