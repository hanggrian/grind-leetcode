package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RemoveDuplicatesFromSortedList2Test extends SampledTest {
    @Test
    void test() {
        RemoveDuplicatesFromSortedList2.values().each { solution ->
            getSamples(RemoveDuplicatesFromSortedList2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.deleteDuplicates(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }

    @Override
    protected String getSampleFilename() {
        return 'remove-duplicates-from-sorted-list-ii.json'
    }
}
