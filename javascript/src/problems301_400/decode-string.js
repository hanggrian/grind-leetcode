class Problem {
  decodeString(s) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  decodeString(s) {
    const stack = [];
    for (const c of s) {
      if (c !== ']') {
        stack.push(c);
        continue;
      }
      let content = '';
      while (stack[stack.length - 1] !== '[') {
        content = stack.pop() + content;
      }
      stack.pop(); // remove '['
      let timesStr = '';
      while (stack.length > 0 && !isNaN(parseInt(stack[stack.length - 1]))) {
        timesStr = stack.pop() + timesStr;
      }
      const times = parseInt(timesStr);
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
