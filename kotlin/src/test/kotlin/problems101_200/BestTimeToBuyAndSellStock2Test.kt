package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class BestTimeToBuyAndSellStock2Test : SampledTest() {
    override fun getSampleFilename(): String = "best-time-to-buy-and-sell-stock-ii.json"

    @Test
    fun test() =
        BestTimeToBuyAndSellStock2.entries.forEach { solution ->
            getSamples(Array<BestTimeToBuyAndSellStock2Sample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.maxProfit(input.prices))
                        .isEqualTo(output)
                }
        }
}
