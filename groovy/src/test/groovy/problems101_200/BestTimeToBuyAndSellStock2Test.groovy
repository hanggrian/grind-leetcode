package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BestTimeToBuyAndSellStock2Test extends SampledTest {
    @Test
    void test() {
        BestTimeToBuyAndSellStock2.values().each { solution ->
            getSamples(BestTimeToBuyAndSellStock2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProfit(sample.input.prices))
                    .isEqualTo(sample.output)
            }
        }
    }

    @Override
    protected String getSampleFilename() {
        return 'best-time-to-buy-and-sell-stock-ii.json'
    }
}
