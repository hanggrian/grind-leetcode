package problems201_300

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class FirstBadVersionTest : SampledTest() {
    @Test
    fun test() =
        getSamples<Array<FirstBadVersionSample>>().forEach { (input, output, _) ->
            assertThat(FirstBadVersion(input.bad).firstBadVersion(input.n))
                .isEqualTo(output)
        }
}
