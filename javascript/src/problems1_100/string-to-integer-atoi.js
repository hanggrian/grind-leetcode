class Problem {
  myAtoi(s) {
    throw new Error(`'Not implemented (${s}).`);
  }
}

class Default extends Problem {
  myAtoi(s) {
    if (!s) {
      return 0;
    }
    s = s.trim();
    let negate = false;
    if (s[0] === '-') {
      s = s.slice(1);
      negate = true;
    } else if (s[0] === '+') {
      s = s.slice(1);
    }

    let result = '';
    for (let c of s) {
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

export const SOLUTIONS = [new Default()];
