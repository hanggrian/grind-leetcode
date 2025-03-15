package problems101_200;

import java.util.Objects;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class LruCacheTest extends SampledTest {
    @Test
    public void test() {
        for (LruCacheSample sample : getSamples(LruCacheSample[].class)) {
            LruCache cache = null;
            for (int i = 0; i < sample.input.moveNames.length; i++) {
                int[] values = sample.input.moveValues[i];
                switch (sample.input.moveNames[i]) {
                    case "LRUCache":
                        cache = new LruCache(values[0]);
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "put":
                        Objects.requireNonNull(cache).set(values[0], values[1]);
                        assertThat(sample.output[i])
                            .isNull();
                        break;
                    case "get":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(cache).get(values[0]));
                        break;
                }
            }
        }
    }
}
