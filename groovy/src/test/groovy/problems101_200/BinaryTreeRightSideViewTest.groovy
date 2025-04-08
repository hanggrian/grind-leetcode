package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BinaryTreeRightSideViewTest extends SampledTest {
    @Test
    void test() {
        BinaryTreeRightSideView.values().each { solution ->
            getSamples(BinaryTreeRightSideViewSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.rightSideView(TreeNode.of(sample.input.root)))
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
