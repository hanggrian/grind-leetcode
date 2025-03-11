package problems1_100

enum StringToIntegerAtoi {
    DEFAULT{
        @Override
        int myAtoi(String s) {
            if (s.isEmpty()) {
                return 0
            }
            s = s.trim()
            var negate = false
            if (s.startsWith('-')) {
                s = s.substring(1)
                negate = true
            } else if (s.startsWith('+')) {
                s = s.substring(1)
            }

            var builder = new StringBuilder()
            for (var c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    builder.append(c)
                    continue
                }
                break
            }
            if (negate) {
                builder.insert(0, '-')
            }
            if (builder.length() == 0
                || (builder.length() == 1 && (builder.charAt(0) == '-' || builder.charAt(0) == '+'))
            ) {
                return 0
            }

            var result = new BigInteger(builder.toString())
            if (result < new BigInteger(String.valueOf(Integer.MIN_VALUE))) {
                return Integer.MIN_VALUE
            } else if (result > new BigInteger(String.valueOf(Integer.MAX_VALUE))) {
                return Integer.MAX_VALUE
            }
            return result.intValue()
        }
    }

    abstract int myAtoi(String s)
}
