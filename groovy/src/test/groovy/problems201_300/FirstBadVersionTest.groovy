package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat

class FirstBadVersionTest extends SampledTest {
    @Test
    void test() {
        getSamples(FirstBadVersionSample[].class).each { sample ->
            assertThat(new FirstBadVersion(sample.input.bad).firstBadVersion(sample.input.n))
                .isEqualTo(sample.output)
        }
    }
}
