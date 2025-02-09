package testing;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class SampledTest {
    private static WeakReference<Gson> gsonRef = new WeakReference<>(null);

    public abstract String getFileName();

    public <T> T getSamples(Class<T> cls) {
        try (BufferedReader reader =
                 new BufferedReader(
                     new InputStreamReader(
                         Objects.requireNonNull(
                             cls.getClassLoader().getResourceAsStream(getFileName())
                         )
                     )
                 )
        ) {
            Gson gson = gsonRef.get();
            if (gson == null) {
                gson = new Gson();
                gsonRef = new WeakReference<>(gson);
            }
            return gson.fromJson(reader.lines().collect(Collectors.joining()), cls);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read sample file.");
        }
    }
}
