package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveDuplicatesFromSortedListTest extends SampledTest {
    @Test
    public void test() {
        for (RemoveDuplicatesFromSortedList solution : RemoveDuplicatesFromSortedList.values()) {
            for (RemoveDuplicatesFromSortedListSample sample
                : getSamples(RemoveDuplicatesFromSortedListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.deleteDuplicates(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
