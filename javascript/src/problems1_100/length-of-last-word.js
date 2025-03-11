class Problem {
  lengthOfLastWord(s) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  lengthOfLastWord(s) {
    const chars = s.split('');
    for (let i = 0; i < chars.length / 2; i++) {
      const temp = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }

    let count = 0;
    let startCounting = false;
    for (let c of chars) {
      if (c === ' ') {
        if (startCounting) {
          break;
        }
      } else {
        startCounting = true;
      }
      if (startCounting) {
        count++;
      }
    }
    return count;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
