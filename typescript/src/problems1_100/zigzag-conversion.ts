class Problem {
  convert(s: string, numRows: number): string {
    throw new Error(`'Not implemented (${s}, ${numRows}).`);
  }
}

class Default extends Problem {
  convert(s: string, numRows: number): string {
    if (numRows === 1) {
      return s;
    }

    let results = [];
    for (let i = 0; i < numRows; i++) {
      results.push('');
    }

    let i = 0;
    let zigzagIndex = 0;
    while (s.length > 0) {
      if (zigzagIndex === 0 || zigzagIndex === i) {
        let c = s.slice(0, 1);
        s = s.slice(1);
        results[i] += c;
      } else {
        results[i] += ' ';
      }
      if (i === numRows - 1) {
        i = 0;
        if (zigzagIndex === 0) {
          zigzagIndex = numRows - 2;
        } else {
          zigzagIndex--;
        }
        continue;
      }
      i++;
    }
    return results.map(r => r.replaceAll(' ', '')).join('');
  }
}

export const SOLUTIONS = [new Default()];
