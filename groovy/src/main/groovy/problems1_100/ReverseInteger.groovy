package problems1_100

enum ReverseInteger {
    DEFAULT{
        @Override
        int reverse(int x) {
            var negate = false
            var builder = new StringBuilder(x.toString())
            if (builder.charAt(0) == '-' as char) {
                builder.deleteCharAt(0)
                negate = true
            }

            try {
                return ((negate ? '-' : '') + builder.reverse()).toInteger()
            } catch (NumberFormatException e) {
                return 0
            }
        }
    }

    abstract int reverse(int x)
}
