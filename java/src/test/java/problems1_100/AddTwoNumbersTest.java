package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class AddTwoNumbersTest extends SampledTest {
    @Test
    public void test() {
        for (AddTwoNumbers solution : AddTwoNumbers.values()) {
            for (AddTwoNumbersSample sample : getSamples(AddTwoNumbersSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.addTwoNumbers(
                            SinglyListNode.of(sample.input.l1),
                            SinglyListNode.of(sample.input.l2)
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
