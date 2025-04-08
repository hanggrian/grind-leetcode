package problems301_400;

import java.util.Stack;

enum DecodeString {
    DEFAULT {
        @Override
        String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c != ']') {
                    stack.push(c);
                    continue;
                }
                StringBuilder contentBuilder = new StringBuilder();
                StringBuilder timeBuilder = new StringBuilder();
                while (stack.peek() != '[') {
                    contentBuilder.append(stack.pop());
                }
                stack.pop(); // remove '['
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    timeBuilder.append(stack.pop());
                }

                String content = contentBuilder.reverse().toString();
                int times = Integer.parseInt(timeBuilder.reverse().toString());

                for (int i = 0; i < times; i++) {
                    for (char contentC : content.toCharArray()) {
                        stack.push(contentC);
                    }
                }
            }
            StringBuilder builder = new StringBuilder();
            for (char c : stack) {
                builder.append(c);
            }
            return builder.toString();
        }
    };

    abstract String decodeString(String s);
}
