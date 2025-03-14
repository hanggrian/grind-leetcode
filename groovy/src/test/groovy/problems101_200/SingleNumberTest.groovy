package problems101_200

import org.junit.Ignore
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

// TODO find out why this test fails
@Ignore
class SingleNumberTest extends SampledTest {
    @Test
    void test() {
        SingleNumber.values().each { solution ->
            getSamples(SingleNumberSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.singleNumber(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
