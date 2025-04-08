class Problem {
  lengthOfLastWord(s: string): number {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  lengthOfLastWord(s: string): number {
    const chars: string[] = s.split('');
    for (let i = 0; i < chars.length / 2; i++) {
      const temp: string = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }

    let count: number = 0;
    let startCounting: boolean = false;
    for (const c of chars) {
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
