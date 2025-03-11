package problems101_200;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SortListTest extends SampledTest {
    @Test
    public void test() {
        for (SortList solution : SortList.values()) {
            for (SortListSample sample : getSamples(SortListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.sortList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
