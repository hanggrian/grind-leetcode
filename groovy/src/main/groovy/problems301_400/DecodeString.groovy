package problems301_400

enum DecodeString {
    DEFAULT{
        @Override
        String decodeString(String s) {
            Stack<Character> stack = []
            for (var c : s.toCharArray()) {
                if (c != ']' as char) {
                    stack.push(c)
                    continue
                }
                var contentBuilder = new StringBuilder()
                var timesBuilder = new StringBuilder()
                while (stack.peek() != '[') {
                    contentBuilder.append(stack.pop())
                }
                stack.pop() // remove '['
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    timesBuilder.append(stack.pop())
                }

                var content = contentBuilder.reverse().toString()
                var times = timesBuilder.reverse().toString().toInteger()

                for (var i = 0; i < times; i++) {
                    for (var contentC : content.toCharArray()) {
                        stack.push(contentC)
                    }
                }
            }
            var builder = new StringBuilder()
            for (var c : stack) {
                builder.append(c)
            }
            return builder.toString()
        }
    }

    abstract String decodeString(String s)
}
