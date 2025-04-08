package problems201_300;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class FirstBadVersionTest extends SampledTest {
    @Test
    public void test() {
        for (FirstBadVersionSample sample
            : getSamples(FirstBadVersionSample[].class)) {
            assertThat(new FirstBadVersion(sample.input.bad).firstBadVersion(sample.input.n))
                .isEqualTo(sample.output);
        }
    }
}
