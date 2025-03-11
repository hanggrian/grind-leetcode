package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveDuplicatesFromSortedList2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "remove-duplicates-from-sorted-list-ii.json";
    }

    @Test
    public void test() {
        for (RemoveDuplicatesFromSortedList2 solution : RemoveDuplicatesFromSortedList2.values()) {
            for (RemoveDuplicatesFromSortedList2Sample sample
                : getSamples(RemoveDuplicatesFromSortedList2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.deleteDuplicates(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
