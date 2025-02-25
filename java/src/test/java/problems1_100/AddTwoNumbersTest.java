package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class AddTwoNumbersTest extends SampledTest {
    @Test
    public void test() {
        for (AddTwoNumbers solution : AddTwoNumbers.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
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

    static class TypedSample extends Sample<TypedSample.Input, int[]> {
        static class Input {
            int[] l1;
            int[] l2;
        }
    }
}
