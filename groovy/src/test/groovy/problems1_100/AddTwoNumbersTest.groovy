package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class AddTwoNumbersTest extends SampledTest {
    @Test
    void test() {
        AddTwoNumbers.values().each { solution ->
            getSamples(AddTwoNumbersSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.addTwoNumbers(
                            SinglyListNode.of(sample.input.l1),
                            SinglyListNode.of(sample.input.l2),
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
