package problems1_100

import java.util.stream.Collectors
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeIntervalsTest extends SampledTest {
    @Test
    void test() {
        MergeIntervals.values().each { solution ->
            getSamples(MergeIntervalsSample[].class).each { sample ->
                // for some reason, single command assert doesn't work
                String message = sample.getMessage()
                int[][] actual = solution.merge(sample.input.intervals)
                for (int i = 0; i < actual.length; i++) {
                    assertWithMessage(message)
                        .that(actual[i])
                        .asList()
                        .containsExactlyElementsIn(
                            Arrays
                                .stream(sample.output[i])
                                .boxed()
                                .collect(Collectors.toList())
                        )
                }
            }
        }
    }
}
