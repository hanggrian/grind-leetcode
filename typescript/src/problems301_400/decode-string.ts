class Problem {
  decodeString(s: string): string {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  decodeString(s: string): string {
    const stack: string[] = [];
    for (const c of s) {
      if (c !== ']') {
        stack.push(c);
        continue;
      }
      let content: string = '';
      while (stack[stack.length - 1] !== '[') {
        content = stack.pop() + content;
      }
      stack.pop(); // remove '['
      let timesStr: string = '';
      while (stack.length > 0 && !isNaN(parseInt(stack[stack.length - 1]))) {
        timesStr = stack.pop() + timesStr;
      }
      const times: number = parseInt(timesStr);
      for (let i = 0; i < times; i++) {
        for (const contentC of content) {
          stack.push(contentC);
        }
      }
    }
    return stack.join('');
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
