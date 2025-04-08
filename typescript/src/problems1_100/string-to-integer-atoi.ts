class Problem {
  myAtoi(s: string): number {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  myAtoi(s: string): number {
    if (!s) {
      return 0;
    }
    s = s.trim();
    let negate: boolean = false;
    if (s[0] === '-') {
      s = s.slice(1);
      negate = true;
    } else if (s[0] === '+') {
      s = s.slice(1);
    }

    let result: string = '';
    for (const c of s) {
      if (c >= '0' && c <= '9') {
        result += c;
        continue;
      }
      break;
    }
    if (negate) {
      result = `-${result}`;
    }
    if (result.length === 0 ||
        (result.length === 1 && (result[0] === '-' || result[0] === '+'))) {
      return 0;
    }
    return parseInt(result);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
