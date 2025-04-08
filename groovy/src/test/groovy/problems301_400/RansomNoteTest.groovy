package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RansomNoteTest extends SampledTest {
    @Test
    void test() {
        RansomNote.values().each { solution ->
            getSamples(RansomNoteSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.canConstruct(sample.input.ransomNote, sample.input.magazine))
                    .isEqualTo(sample.output)
            }
        }
    }
}
