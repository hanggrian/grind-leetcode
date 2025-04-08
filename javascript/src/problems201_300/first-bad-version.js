export default class FirstBadVersion {
  constructor(badVersion) {
    this.badVersion = badVersion;
  }

  isBadVersion(version) {
    return version >= this.badVersion;
  }

  firstBadVersion(n) {
    let startIndex = 1;
    let endIndex = n;
    while (startIndex <= endIndex) {
      const midIndex = Math.floor(startIndex + (endIndex - startIndex) / 2);
      if (this.isBadVersion(midIndex)) {
        endIndex = midIndex - 1;
      } else {
        startIndex = midIndex + 1;
      }
    }
    return startIndex;
  }
}
