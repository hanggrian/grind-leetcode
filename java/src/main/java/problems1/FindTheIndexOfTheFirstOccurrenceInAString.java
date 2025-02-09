package problems1;

public enum FindTheIndexOfTheFirstOccurrenceInAString {
    DEFAULT {
        @Override
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    };

    public abstract int strStr(String haystack, String needle);
}
