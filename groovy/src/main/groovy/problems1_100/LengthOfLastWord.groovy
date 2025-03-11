package problems1_100

enum LengthOfLastWord {
    DEFAULT{
        @Override
        int lengthOfLastWord(String s) {
            var chars = s.toCharArray()
            for (var i = 0; i < chars.length / 2; i++) {
                var temp = chars[i]
                chars[i] = chars[chars.length - 1 - i]
                chars[chars.length - 1 - i] = temp
            }

            var count = 0
            var startCounting = false
            for (var c : chars) {
                if (c == ' ' as char) {
                    if (startCounting) {
                        break
                    }
                } else {
                    startCounting = true
                }
                if (startCounting) {
                    count++
                }
            }
            return count
        }
    }

    abstract int lengthOfLastWord(String s)
}
