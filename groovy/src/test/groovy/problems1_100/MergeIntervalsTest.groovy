package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeIntervalsTest extends SampledTest {
    @Test
    void test() {
        MergeIntervals.values().each { solution ->
            getSamples(MergeIntervalsSample[].class).each { sample ->
                // for some reason, single command assert doesn't work
                var message = sample.getMessage()
                var actual = solution.merge(sample.input.intervals)
                for (var i = 0; i < actual.length; i++) {
                    assertWithMessage(message)
                        .that(actual[i])
                        .asList()
                        .containsExactlyElementsIn(sample.output[i].toList())
                        .inOrder()
                }
            }
        }
    }
}
