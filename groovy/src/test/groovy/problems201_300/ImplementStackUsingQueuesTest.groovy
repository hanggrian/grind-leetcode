package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat

class ImplementStackUsingQueuesTest extends SampledTest {
    @Test
    void test() {
        getSamples(ImplementStackUsingQueuesSample[].class).each { sample ->
            ImplementStackUsingQueues stack = null
            for (var i = 0; i < sample.input.moveNames.length; i++) {
                var values = sample.input.moveValues[i]
                switch (sample.input.moveNames[i]) {
                    case "MyStack":
                        stack = new ImplementStackUsingQueues()
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "push":
                        Objects.requireNonNull(stack).push(values[0])
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "top":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).top())
                        break
                    case "pop":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).pop())
                        break
                    case "empty":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).empty())
                        break
                }
            }
        }
    }
}
