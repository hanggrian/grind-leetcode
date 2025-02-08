import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class AddTwoNumbersTest extends SampledTest {
    @Override
    public String getFileName() {
        return "add_two_numbers.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (AddTwoNumbers solution : AddTwoNumbers.values()) {
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

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[] l1;
            public int[] l2;
        }
    }
}
