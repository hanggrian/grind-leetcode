class Problem {
  strStr(haystack, needle) {
    throw new Error(`Not implemented (${haystack}, ${needle}).`);
  }
}

class Default extends Problem {
  strStr(haystack, needle) {
    return haystack.indexOf(needle);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
