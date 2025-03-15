package problems1_100

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidateBinarySearchTreeTest extends SampledTest {
    @Test
    void test() {
        ValidateBinarySearchTree.values().each { solution ->
            getSamples(ValidateBinarySearchTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidBst(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
