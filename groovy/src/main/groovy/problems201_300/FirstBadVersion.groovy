package problems201_300

class FirstBadVersion {
    private final int badVersion

    FirstBadVersion(int badVersion) {
        this.badVersion = badVersion
    }

    boolean isBadVersion(int badVersion) {
        return this.badVersion == badVersion
    }

    int firstBadVersion(int n) {
        var startIndex = 1
        var endIndex = n
        while (startIndex <= endIndex) {
            int midIndex = (int) startIndex + (endIndex - startIndex) / 2
            if (isBadVersion(midIndex)) {
                endIndex = midIndex - 1
            } else {
                startIndex = midIndex + 1
            }
        }
        return startIndex
    }
}
