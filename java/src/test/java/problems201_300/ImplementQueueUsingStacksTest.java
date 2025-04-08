package problems201_300;

import java.util.Objects;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class ImplementQueueUsingStacksTest extends SampledTest {
    @Test
    public void test() {
        for (ImplementQueueUsingStacksSample sample
            : getSamples(ImplementQueueUsingStacksSample[].class)) {
            ImplementQueueUsingStacks queue = null;
            for (int i = 0; i < sample.input.moveNames.length; i++) {
                int[] values = sample.input.moveValues[i];
                switch (sample.input.moveNames[i]) {
                    case "MyQueue":
                        queue = new ImplementQueueUsingStacks();
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "push":
                        Objects.requireNonNull(queue).push(values[0]);
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "peek":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).peek());
                        break;
                    case "pop":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).pop());
                        break;
                    case "empty":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).empty());
                        break;
                }
            }
        }
    }
}
