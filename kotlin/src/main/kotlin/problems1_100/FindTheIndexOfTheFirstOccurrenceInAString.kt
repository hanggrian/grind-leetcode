package problems1_100

enum class FindTheIndexOfTheFirstOccurrenceInAString {
    DEFAULT {
        override fun strStr(haystack: String, needle: String): Int = haystack.indexOf(needle)
    },
    ;

    abstract fun strStr(haystack: String, needle: String): Int
}
