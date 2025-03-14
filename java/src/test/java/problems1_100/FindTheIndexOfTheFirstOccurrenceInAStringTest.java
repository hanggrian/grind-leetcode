package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest extends SampledTest {
    @Test
    public void test() {
        for (FindTheIndexOfTheFirstOccurrenceInAString solution
            : FindTheIndexOfTheFirstOccurrenceInAString.values()) {
            for (FindTheIndexOfTheFirstOccurrenceInAStringSample sample
                : getSamples(FindTheIndexOfTheFirstOccurrenceInAStringSample[].class)) {
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
}
