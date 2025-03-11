package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BestTimeToBuyAndSellStockTest extends SampledTest {
    @Test
    void test() {
        BestTimeToBuyAndSellStock.values().each { solution ->
            getSamples(BestTimeToBuyAndSellStockSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProfit(sample.input.prices))
                    .isEqualTo(sample.output)
            }
        }
    }
}
