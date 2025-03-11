package problems1_100

enum LongestCommonPrefix {
    DEFAULT{
        @Override
        String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return ''
            }
            if (strs.length == 1) {
                return strs[0]
            }
            var longestStr =
                Arrays.stream(strs).max(Comparator.comparingInt(String::length)).get()
            var end = -1
            loop:
            for (var i = 0; i < longestStr.length(); i++) {
                var c = longestStr.charAt(i)
                for (var j = 0; j < strs.length; j++) {
                    var str = strs[j]
                    if (i > str.length() - 1 || c != str.charAt(i)) {
                        break loop
                    } else if (j == strs.length - 1) {
                        end = i
                    }
                }
            }
            return longestStr.substring(0, end + 1)
        }
    }

    abstract String longestCommonPrefix(String[] strs)
}
