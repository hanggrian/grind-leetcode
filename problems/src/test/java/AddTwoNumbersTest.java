import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class AddTwoNumbersTest extends SampledTest {
    @Override
    public String getFileName() {
        return "add_two_numbers.json";
    }

    @Test
    public void test() {
        for (Sample sample : getSamples(Sample[].class)) {
            for (AddTwoNumbers solution : AddTwoNumbers.values()) {
                assertWithMessage(sample.explanation)
                    .that(
                        solution.addTwoNumbers(
                            SinglyListNode.of(sample.input.l1),
                            SinglyListNode.of(sample.input.l2)
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }

    public static class Sample {
        public Input input;
        public int[] output;
        public String explanation;

        public static class Input {
            public int[] l1;
            public int[] l2;
        }
    }
}
