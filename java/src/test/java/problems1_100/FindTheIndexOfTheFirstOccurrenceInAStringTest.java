package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest extends SampledTest {
    @Test
    public void test() {
        for (FindTheIndexOfTheFirstOccurrenceInAString solution
            : FindTheIndexOfTheFirstOccurrenceInAString.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.strStr(
                            sample.input.haystack,
                            sample.input.needle
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Integer> {
        static class Input {
            String haystack;
            String needle;
        }
    }
}
