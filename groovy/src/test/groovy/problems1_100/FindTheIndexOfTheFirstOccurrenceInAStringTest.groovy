package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class FindTheIndexOfTheFirstOccurrenceInAStringTest extends SampledTest {
    @Test
    void test() {
        for (FindTheIndexOfTheFirstOccurrenceInAString solution : FindTheIndexOfTheFirstOccurrenceInAString.values()) {
            for (FindTheIndexOfTheFirstOccurrenceInAStringSample sample : getSamples(FindTheIndexOfTheFirstOccurrenceInAStringSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.strStr(
                            sample.input.haystack,
                            sample.input.needle,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
