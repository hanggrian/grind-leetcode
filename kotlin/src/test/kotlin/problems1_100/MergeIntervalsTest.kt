package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class MergeIntervalsTest : SampledTest() {
    @Test
    fun test() =
        MergeIntervals.entries.forEach { solution ->
            getSamples(Array<MergeIntervalsSample>::class.java)
                .forEach { (input, output, message) ->
                    // for some reason, single command assert doesn't work
                    val actual = solution.merge(input.intervals)
                    for (i in actual.indices) {
                        assertWithMessage(message)
                            .that(actual[i])
                            .asList()
                            .containsExactlyElementsIn(output[i].toList())
                    }
                }
        }
}
