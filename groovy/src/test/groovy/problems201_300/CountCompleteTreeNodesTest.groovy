package problems201_300

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class CountCompleteTreeNodesTest extends SampledTest {
    @Test
    void test() {
        CountCompleteTreeNodes.values().each { solution ->
            getSamples(CountCompleteTreeNodesSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.countNodes(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
