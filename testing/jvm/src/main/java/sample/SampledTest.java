package sample;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class SampledTest {
    private static WeakReference<Gson> gsonRef = new WeakReference<>(null);

    protected final <T> T getSamples(Class<T> cls) {
        Gson gson = gsonRef.get();
        if (gson == null) {
            gson = new Gson();
            gsonRef = new WeakReference<>(gson);
        }
        String fileName = getSampleFilename();
        try (BufferedReader reader =
                 new BufferedReader(
                     new InputStreamReader(
                         Objects.requireNonNull(
                             cls
                                 .getClassLoader()
                                 .getResourceAsStream(fileName)
                         )
                     )
                 )
        ) {
            return gson.fromJson(reader.lines().collect(Collectors.joining()), cls);
        } catch (IOException e) {
            throw new RuntimeException(String.format("Failed to read '%s'.", fileName));
        }
    }

    protected String getSampleFilename() {
        String clsName = getClass().getSimpleName();
        clsName = clsName.substring(0, clsName.indexOf("Test"));

        StringBuilder builder = new StringBuilder();
        for (char c : clsName.toCharArray()) {
            if (!builder.isEmpty() && Character.isUpperCase(c)) {
                builder.append('-');
            }
            builder.append(Character.toLowerCase(c));
        }
        return builder.append(".json").toString();
    }
}
