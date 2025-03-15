package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class BestTimeToBuyAndSellStockTest : SampledTest() {
    @Test
    fun test() =
        BestTimeToBuyAndSellStock.entries.forEach { solution ->
            getSamples<Array<BestTimeToBuyAndSellStockSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.maxProfit(input.prices))
                        .isEqualTo(output)
                }
        }
}
