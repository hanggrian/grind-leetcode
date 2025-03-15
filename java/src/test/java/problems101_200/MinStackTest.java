package problems101_200;

import java.util.Objects;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class MinStackTest extends SampledTest {
    @Test
    public void test() {
        for (MinStackSample sample : getSamples(MinStackSample[].class)) {
            MinStack stack = null;
            for (int i = 0; i < sample.input.moveNames.length; i++) {
                int[] values = sample.input.moveValues[i];
                switch (sample.input.moveNames[i]) {
                    case "MinStack":
                        stack = new MinStack();
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "push":
                        Objects.requireNonNull(stack).push(values[0]);
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "getMininimum":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).getMinimum());
                        break;
                    case "pop":
                        Objects.requireNonNull(stack).pop();
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "top":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).top());
                        break;
                }
            }
        }
    }
}
