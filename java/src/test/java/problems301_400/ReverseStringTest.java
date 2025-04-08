package problems301_400;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ReverseStringTest extends SampledTest {
    @Test
    public void test() {
        for (ReverseString solution : ReverseString.values()) {
            for (ReverseStringSample sample : getSamples(ReverseStringSample[].class)) {
                char[] s = sample.input.s;
                solution.reverseString(s);
                List<Character> output = new ArrayList<>();
                for (char c : sample.output) {
                    output.add(c);
                }
                assertWithMessage(sample.getMessage())
                    .that(s)
                    .asList()
                    .containsExactlyElementsIn(output);
            }
        }
    }
}
