class Problem {
  longestCommonPrefix(strs) {
    throw new Error(`Not implemented (${strs}).`);
  }
}

class Default extends Problem {
  longestCommonPrefix(strs) {
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
          const c = longestStr.charAt(i);
          for (let j = 0; j < strs.length; j++) {
            const str = strs[j];
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

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
