package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;

public class LruCacheTest extends SampledTest {
    @Test
    public void test() {
        LruCache cache = new LruCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertThat(cache.cache)
            .containsEntry(1, 1);
        assertThat(cache.cache)
            .containsEntry(2, 2);
        assertThat(cache.get(1))
            .isEqualTo(1);

        cache.put(3, 3);
        assertThat(cache.cache)
            .containsEntry(1, 1);
        assertThat(cache.cache)
            .containsEntry(3, 3);
        assertThat(cache.get(2))
            .isEqualTo(-1);

        cache.put(4, 4);
        assertThat(cache.cache)
            .containsEntry(4, 4);
        assertThat(cache.cache)
            .containsEntry(3, 3);
        assertThat(cache.get(1))
            .isEqualTo(-1);
        assertThat(cache.get(3))
            .isEqualTo(3);
        assertThat(cache.get(4))
            .isEqualTo(4);
    }
}
