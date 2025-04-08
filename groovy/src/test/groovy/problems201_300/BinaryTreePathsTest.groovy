package problems201_300

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BinaryTreePathsTest extends SampledTest {
    @Test
    void test() {
        BinaryTreePaths.values().each { solution ->
            getSamples(BinaryTreePathsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.binaryTreePaths(TreeNode.of(sample.input.root)))
                    .containsExactlyElementsIn(sample.output)
                    .inOrder()
            }
        }
    }
}
