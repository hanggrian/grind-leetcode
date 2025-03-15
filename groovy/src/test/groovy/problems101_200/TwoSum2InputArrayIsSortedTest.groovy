package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class TwoSum2InputArrayIsSortedTest extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'two-sum-ii-input-array-is-sorted.json'
    }

    @Test
    void test() {
        TwoSum2InputArrayIsSorted.values().each { solution ->
            getSamples(TwoSum2InputArrayIsSortedSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.twoSum(sample.input.numbers, sample.input.target))
                    .asList()
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
