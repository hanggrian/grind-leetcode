package problems1_100;

enum LengthOfLastWord {
    DEFAULT {
        @Override
        int lengthOfLastWord(String s) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }

            int count = 0;
            boolean startCounting = false;
            for (char c : chars) {
                if (c == ' ') {
                    if (startCounting) {
                        break;
                    }
                } else {
                    startCounting = true;
                }
                if (startCounting) {
                    count++;
                }
            }
            return count;
        }
    };

    abstract int lengthOfLastWord(String s);
}
