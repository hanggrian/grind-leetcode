export default class FirstBadVersion {
  badVersion: number;

  constructor(badVersion: number) {
    this.badVersion = badVersion;
  }

  isBadVersion(version: number): boolean {
    return version >= this.badVersion;
  }

  firstBadVersion(n: number): number {
    let startIndex: number = 1;
    let endIndex: number = n;
    while (startIndex <= endIndex) {
      const midIndex: number = Math.floor(startIndex + (endIndex - startIndex) / 2);
      if (this.isBadVersion(midIndex)) {
        endIndex = midIndex - 1;
      } else {
        startIndex = midIndex + 1;
      }
    }
    return startIndex;
  }
}
