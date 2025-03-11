class Problem {
  reverse(x) {
    throw new Error(`Not implemented (${x}).`);
  }
}

class Default extends Problem {
  reverse(x) {
    let negate = false;
    let s = x.toString();
    if (s[0] === '-') {
      s = s.slice(1);
      negate = true;
    }

    if (negate) {
      return -parseInt(s.split('').reverse().join(''));
    }
    return parseInt(s.split('').reverse().join(''));
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
