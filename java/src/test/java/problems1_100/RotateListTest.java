package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RotateListTest extends SampledTest {
    @Test
    public void test() {
        for (RotateList solution : RotateList.values()) {
            for (RotateListSample sample : getSamples(RotateListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.rotateRight(
                            SinglyListNode.of(sample.input.head),
                            sample.input.k
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
