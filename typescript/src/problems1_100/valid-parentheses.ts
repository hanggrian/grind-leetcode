class Problem {
  isValid(s: string): boolean {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  isValid(s: string): boolean {
    if (s.length % 2 === 1) {
      return false;
    }
    const symbols = [];
    for (const c of s) {
      if (c === ')' || c === '}' || c === ']') {
        if (symbols.length > 0 && symbols[symbols.length - 1] === '(' && c === ')') {
          symbols.pop();
        } else if (symbols.length > 0 && symbols[symbols.length - 1] === '{' && c === '}') {
          symbols.pop();
        } else if (symbols.length > 0 && symbols[symbols.length - 1] === '[' && c === ']') {
          symbols.pop();
        }
      } else {
        symbols.push(c);
      }
    }
    return symbols.length === 0;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
