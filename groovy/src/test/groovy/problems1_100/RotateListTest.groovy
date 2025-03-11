package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RotateListTest extends SampledTest {
    @Test
    void test() {
        RotateList.values().each { solution ->
            getSamples(RotateListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.rotateRight(
                            SinglyListNode.of(sample.input.head),
                            sample.input.k,
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
