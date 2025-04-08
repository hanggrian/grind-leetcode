package problems201_300;

class FirstBadVersion {
    private final int badVersion;

    FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int badVersion) {
        return this.badVersion == badVersion;
    }

    int firstBadVersion(int n) {
        int startIndex = 1;
        int endIndex = n;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (isBadVersion(midIndex)) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return startIndex;
    }
}
