package problems201_300

class FirstBadVersion(private val badVersion: Int) {
    fun isBadVersion(badVersion: Int): Boolean = this.badVersion == badVersion

    fun firstBadVersion(n: Int): Int {
        var startIndex = 1
        var endIndex = n
        while (startIndex <= endIndex) {
            val midIndex = startIndex + (endIndex - startIndex) / 2
            if (isBadVersion(midIndex)) {
                endIndex = midIndex - 1
            } else {
                startIndex = midIndex + 1
            }
        }
        return startIndex
    }
}
