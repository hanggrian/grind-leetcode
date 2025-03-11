class Problem {
  strStr(haystack: string, needle: string): number {
    throw new Error(`Not implemented (${haystack}, ${needle}).`);
  }
}

class Default extends Problem {
  strStr(haystack: string, needle: string): number {
    return haystack.indexOf(needle);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
