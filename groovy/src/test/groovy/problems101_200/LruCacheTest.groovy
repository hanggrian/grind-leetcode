package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat

class LruCacheTest extends SampledTest {
    @Test
    void test() {
        getSamples(LruCacheSample[].class).each { sample ->
            LruCache cache = null
            for (var i = 0; i < sample.input.moveNames.length; i++) {
                var values = sample.input.moveValues[i]
                switch (sample.input.moveNames[i]) {
                    case "LRUCache":
                        cache = new LruCache(values[0])
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "put":
                        Objects.requireNonNull(cache).set(values[0], values[1])
                        assertThat(sample.output[i])
                            .isNull()
                        break
                    case "get":
                        assertThat(sample.output[i])
                            .isEqualTo(Objects.requireNonNull(cache).get(values[0]))
                        break
                }
            }
        }
    }
}
