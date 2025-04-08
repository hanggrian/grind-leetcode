package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class IntersectionOfTwoArrays2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "intersection-of-two-arrays-ii.json"
    }

    @Test
    void test() {
        IntersectionOfTwoArrays2.values().each { solution ->
            getSamples(IntersectionOfTwoArrays2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.intersect(sample.input.nums1, sample.input.nums2))
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList())
            }
        }
    }
}
