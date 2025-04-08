package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ReverseStringTest extends SampledTest {
    @Test
    void test() {
        ReverseString.values().each { solution ->
            getSamples(ReverseStringSample[].class).each { sample ->
                var s = sample.input.s
                solution.reverseString(s)
                ArrayList<Character> output = []
                for (var c : sample.output) {
                    output.add(c)
                }
                assertWithMessage(sample.getMessage())
                    .that(s)
                    .asList()
                    .containsExactlyElementsIn(output)
            }
        }
    }
}
