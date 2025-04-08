package problems301_400;

enum ReverseString {
    DEFAULT {
        @Override
        void reverseString(char[] s) {
            for (int left = 0; left < s.length / 2; left++) {
                int right = s.length - 1 - left;
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }
        }
    };

    abstract void reverseString(char[] s);
}
