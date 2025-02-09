package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest extends SampledTest {
    @Override
    public String getFileName() {
        return "find_the_index_of_the_first_occurrence_in_a_string.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public String haystack;
            public String needle;
        }
    }
}
