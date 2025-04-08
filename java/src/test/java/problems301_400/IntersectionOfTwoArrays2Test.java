package problems301_400;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IntersectionOfTwoArrays2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "intersection-of-two-arrays-ii.json";
    }

    @Test
    public void test() {
        for (IntersectionOfTwoArrays2 solution : IntersectionOfTwoArrays2.values()) {
            for (IntersectionOfTwoArrays2Sample sample
                : getSamples(IntersectionOfTwoArrays2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.intersect(sample.input.nums1, sample.input.nums2))
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList());
            }
        }
    }
}
