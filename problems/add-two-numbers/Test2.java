import static org.junit.Assert.assertEquals;
import java.io.FileReader;
import org.junit.Test;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test2 {
  @Test
  public void test() throws Exception {
    final Gson gson = new Gson();
    final Sample[] json = gson.fromJson(
        new JsonReader(new FileReader("problems/add-two-numbers/sample.json")),
        Sample[].class);
    for (int i = 0; i < json.length; i++) {
      final Sample sample = json[i];
      assertEquals(
          sample.explanation,
          SinglyListNode.of(sample.output),
          Solution2.addTwoNumbers(
              SinglyListNode.of(sample.input.l1),
              SinglyListNode.of(sample.input.l2)
          )
      );
    }
  }

  public static class Sample {
    public Input input;
    public int[] output;
    public String explanation;

    public static class Input {
      public int[] l1;
      public int[] l2;
    }
  }
}
