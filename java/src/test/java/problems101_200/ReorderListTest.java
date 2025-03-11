package problems101_200;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ReorderListTest extends SampledTest {
    @Test
    public void test() {
        for (ReorderList solution : ReorderList.values()) {
            for (ReorderListSample sample : getSamples(ReorderListSample[].class)) {
                SinglyListNode input = SinglyListNode.of(sample.input.head);
                solution.reorderList(input);
                assertWithMessage(sample.getMessage())
                    .that(input)
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
