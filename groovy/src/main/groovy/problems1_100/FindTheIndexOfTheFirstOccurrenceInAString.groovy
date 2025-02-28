package problems1_100

enum FindTheIndexOfTheFirstOccurrenceInAString {
    DEFAULT {
        @Override
        int strStr(String haystack, String needle) {
            return haystack.indexOf(needle)
        }
    }

    abstract int strStr(String haystack, String needle)
}
