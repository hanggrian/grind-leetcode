package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ReverseLinkedList2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'reverse-linked-list-ii.json'
    }

    @Test
    void test() {
        ReverseLinkedList2.values().each { solution ->
            getSamples(ReverseLinkedList2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.reverseBetween(
                            SinglyListNode.of(sample.input.head),
                            sample.input.left,
                            sample.input.right,
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
