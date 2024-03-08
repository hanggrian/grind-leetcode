import static org.junit.Assert.assertArrayEquals;
import java.io.FileReader;
import org.junit.Test;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test1 {
  @Test
  public void test() throws Exception {
    final Gson gson = new Gson();
    final Sample[] json = gson.fromJson(
        new JsonReader(new FileReader("problems/two-sum/sample.json")),
        Sample[].class);
    for (int i = 0; i < json.length; i++) {
      final Sample sample = json[i];
      assertArrayEquals(
          sample.explanation,
          sample.output,
          Solution1.BruteForce.twoSum(sample.input.nums, sample.input.target)
      );
      assertArrayEquals(
          sample.explanation,
          sample.output,
          Solution1.SinglePass.twoSum(sample.input.nums, sample.input.target)
      );
    }
  }

  public static class Sample {
    public Input input;
    public int[] output;
    public String explanation;

    public static class Input {
      public int[] nums;
      public int target;
    }
  }
}
