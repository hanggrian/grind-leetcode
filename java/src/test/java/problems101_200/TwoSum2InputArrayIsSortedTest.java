package problems101_200;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TwoSum2InputArrayIsSortedTest extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "two-sum-ii-input-array-is-sorted.json";
    }

    @Test
    public void test() {
        for (TwoSum2InputArrayIsSorted solution : TwoSum2InputArrayIsSorted.values()) {
            for (TwoSum2InputArrayIsSortedSample sample
                : getSamples(TwoSum2InputArrayIsSortedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.twoSum(sample.input.numbers, sample.input.target))
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList()
                    ).inOrder();
            }
        }
    }
}
