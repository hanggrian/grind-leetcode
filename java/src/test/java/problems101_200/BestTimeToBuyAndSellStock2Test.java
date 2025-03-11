package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BestTimeToBuyAndSellStock2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "best-time-to-buy-and-sell-stock-ii.json";
    }

    @Test
    public void test() {
        for (BestTimeToBuyAndSellStock2 solution : BestTimeToBuyAndSellStock2.values()) {
            for (BestTimeToBuyAndSellStock2Sample sample
                : getSamples(BestTimeToBuyAndSellStock2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProfit(sample.input.prices))
                    .isEqualTo(sample.output);
            }
        }
    }
}
