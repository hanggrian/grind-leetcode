package problems1_100;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PlusOneTest extends SampledTest {
    @Test
    public void test() {
        for (PlusOne solution : PlusOne.values()) {
            for (PlusOneSample sample : getSamples(PlusOneSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.plusOne(sample.input.digits))
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList()
                    );
            }
        }
    }
}
