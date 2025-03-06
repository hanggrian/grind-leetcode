class Problem {
  longestCommonPrefix(strs: string[]): string {
    throw new Error(`'Not implemented (${strs}).`);
  }
}

class Default extends Problem {
  longestCommonPrefix(strs: string[]): string {
    if (strs.length === 0) {
      return '';
    }
    if (strs.length === 1) {
      return strs[0];
    }
    let longestStr =
        strs.reduce((previous, current) => current.length > previous.length ? current : previous);
    let end = -1;
    loop:
        for (let i = 0; i < longestStr.length; i++) {
          let c = longestStr.charAt(i);
          for (let j = 0; j < strs.length; j++) {
            let str = strs[j];
            if (i > str.length - 1 || c !== str.charAt(i)) {
              break loop;
            } else if (j === strs.length - 1) {
              end = i;
            }
          }
        }
    return longestStr.substring(0, end + 1);
  }
}

export const SOLUTIONS = [new Default()];
