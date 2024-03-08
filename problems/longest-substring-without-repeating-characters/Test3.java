import static org.junit.Assert.assertEquals;
import java.io.FileReader;
import org.junit.Test;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test3 {
  @Test
  public void test() throws Exception {
    final var gson = new Gson();
    final Sample[] json = gson.fromJson(
        new JsonReader(
            new FileReader("problems/longest-substring-without-repeating-characters/sample.json")),
        Sample[].class);
    for (var i = 0; i < json.length; i++) {
      final var sample = json[i];
      assertEquals(
          sample.explanation,
          sample.output,
          Solution3.lengthOfLongestSubstring(sample.input)
      );
    }
  }

  public static class Sample {
    public String input;
    public int output;
    public String explanation;
  }
}
