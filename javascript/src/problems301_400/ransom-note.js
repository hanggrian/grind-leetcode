class Problem {
  canConstruct(ransomNote, magazine) {
    throw new Error(`Not implemented (${ransomNote}, ${magazine}).`);
  }
}

class Default extends Problem {
  canConstruct(ransomNote, magazine) {
    const map = new Array(128).fill(0);
    for (let i = 0; i < ransomNote.length; i++) {
      map[ransomNote.charCodeAt(i)]++;
    }
    for (let i = 0; i < magazine.length; i++) {
      map[magazine.charCodeAt(i)]--;
    }
    for (let i = 0; i < map.length; i++) {
      if (map[i] > 0) {
        return false;
      }
    }
    return true;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
