package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BestTimeToBuyAndSellStockTest extends SampledTest {
    @Test
    public void test() {
        for (BestTimeToBuyAndSellStock solution : BestTimeToBuyAndSellStock.values()) {
            for (BestTimeToBuyAndSellStockSample sample
                : getSamples(BestTimeToBuyAndSellStockSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProfit(sample.input.prices))
                    .isEqualTo(sample.output);
            }
        }
    }
}
