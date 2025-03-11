package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class MinStackTest extends SampledTest {
    @Test
    public void test() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertThat(stack.getMinimum())
            .isEqualTo(-3);

        stack.pop();
        assertThat(stack.top())
            .isEqualTo(0);
        assertThat(stack.getMinimum())
            .isEqualTo(-2);
    }
}
