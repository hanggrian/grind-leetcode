package problems101_200

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class LruCacheTest : SampledTest() {
    @Test
    fun test() {
        getSamples<Array<LruCacheSample>>().forEach { (input, output, _) ->
            var cache: LruCache? = null
            for (i in input.moveNames.indices) {
                val values = input.moveValues[i]
                when (input.moveNames[i]) {
                    "LRUCache" -> {
                        cache = LruCache(values[0])
                        assertThat(output[i])
                            .isNull()
                    }
                    "put" -> {
                        cache!![values[0]] = values[1]
                        assertThat(output[i])
                            .isNull()
                    }
                    "get" ->
                        assertThat(output[i])
                            .isEqualTo(cache!![values[0]])
                }
            }
        }
    }
}
