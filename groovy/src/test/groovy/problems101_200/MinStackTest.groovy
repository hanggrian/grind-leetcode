package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat

class MinStackTest extends SampledTest {
    @Test
    void test() {
        getSamples(MinStackSample[].class).each { sample ->
            MinStack stack = null
            for (var i = 0; i < sample.input.moveNames.length; i++) {
                var values = sample.input.moveValues[i]
                switch (sample.input.moveNames[i]) {
                    case 'MinStack':
                        stack = new MinStack()
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case 'push':
                        Objects.requireNonNull(stack).push(values[0])
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case 'getMininimum':
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).getMinimum())
                        break
                    case 'pop':
                        Objects.requireNonNull(stack).pop()
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case 'top':
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(stack).top())
                        break
                }
            }
        }
    }
}
