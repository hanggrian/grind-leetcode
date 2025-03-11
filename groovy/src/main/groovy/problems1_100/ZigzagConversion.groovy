package problems1_100

import java.util.stream.Collectors

enum ZigzagConversion {
    DEFAULT{
        @Override
        String convert(String s, int numRows) {
            if (numRows == 1) {
                return s
            }

            var builders = new StringBuilder[numRows]
            for (var i = 0; i < numRows; i++) {
                builders[i] = new StringBuilder()
            }

            var i = 0
            var zigzagIndex = 0
            while (!s.isEmpty()) {
                if (zigzagIndex == 0 || zigzagIndex == i) {
                    var c = s.substring(0, 1)
                    s = s.substring(1)
                    builders[i].append(c)
                } else {
                    builders[i].append(' ')
                }
                if (i == numRows - 1) {
                    i = 0
                    if (zigzagIndex == 0) {
                        zigzagIndex = numRows - 2
                    } else {
                        zigzagIndex--
                    }
                    continue
                }
                i++
            }
            return Arrays
                .stream(builders)
                .map(builder -> builder.toString().replace(' ', ''))
                .collect(Collectors.joining())
        }
    }

    abstract String convert(String s, int numRows)
}
