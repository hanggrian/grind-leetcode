package problems1_100;

enum MinimumWindowSubstring {
    DEFAULT {
        @Override
        String minWindow(String s, String t) {
            if (t.length() > s.length()) {
                return "";
            }

            int[] sMap = new int[128];
            int[] tMap = new int[128];
            for (char c : t.toCharArray()) {
                tMap[c]++;
            }

            int left = 0;
            int right = 0;
            String result = "";
            while (right < s.length()) {
                sMap[s.charAt(right)]++;
                right++;
                while (left <= right && contains(sMap, tMap)) {
                    result = getMinLength(result, s.substring(left, right));
                    sMap[s.charAt(left)]--;
                    left++;
                }
            }
            return result;
        }

        String getMinLength(String s1, String s2) {
            return s1.isEmpty() || s1.length() > s2.length()
                ? s2
                : s1;
        }

        boolean contains(int[] sMap, int[] tMap) {
            for (int i = 0; i < tMap.length; i++) {
                if (tMap[i] > sMap[i]) {
                    return false;
                }
            }
            return true;
        }
    };

    abstract String minWindow(String s, String t);
}
