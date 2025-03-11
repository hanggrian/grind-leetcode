package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class FindTheIndexOfTheFirstOccurrenceInAStringTest extends SampledTest {
    @Test
    void test() {
        FindTheIndexOfTheFirstOccurrenceInAString.values().each { solution ->
            getSamples(FindTheIndexOfTheFirstOccurrenceInAStringSample[].class).each { sample ->
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
