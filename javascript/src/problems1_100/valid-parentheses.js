class Problem {
  isValid(s) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  isValid(s) {
    if (s.length % 2 === 1) {
      return false;
    }

    const symbols = [];
    for (const c of s) {
      if (!(c === ')' || c === '}' || c === ']')) {
        symbols.push(c);
        continue;
      }

      if (symbols.length > 0 &&
          ((symbols[symbols.length - 1] === '(' && c === ')') ||
              (symbols[symbols.length - 1] === '{' && c === '}') ||
              (symbols[symbols.length - 1] === '[' && c === ']'))
      ) {
        symbols.pop();
        continue;
      }
      return false;
    }
    return symbols.length === 0;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
