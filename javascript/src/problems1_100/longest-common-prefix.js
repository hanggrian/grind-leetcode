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
    const longestStr =
        strs.reduce((previous, current) => current.length > previous.length ? current : previous);
    let end = -1;
    loop:
        for (let i = 0; i < longestStr.length; i++) {
          const c = longestStr[i];
          for (let j = 0; j < strs.length; j++) {
            const str = strs[j];
            if (i > str.length - 1 || c !== str[i]) {
              break loop;
            } else if (j === strs.length - 1) {
              end = i;
            }
          }
        }
    return longestStr.slice(0, end + 1);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
