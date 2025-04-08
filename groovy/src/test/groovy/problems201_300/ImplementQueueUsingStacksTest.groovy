package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat

class ImplementQueueUsingStacksTest extends SampledTest {
    @Test
    void test() {
        getSamples(ImplementQueueUsingStacksSample[].class).each { sample ->
            ImplementQueueUsingStacks queue = null
            for (var i = 0; i < sample.input.moveNames.length; i++) {
                var values = sample.input.moveValues[i]
                switch (sample.input.moveNames[i]) {
                    case "MyQueue":
                        queue = new ImplementQueueUsingStacks()
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "push":
                        Objects.requireNonNull(queue).push(values[0])
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "peek":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).peek())
                        break
                    case "pop":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).pop())
                        break
                    case "empty":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(queue).empty())
                        break
                }
            }
        }
    }
}
