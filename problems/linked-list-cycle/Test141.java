import static org.junit.Assert.assertEquals;
import java.io.FileReader;
import org.junit.Test;
import com.google.common.collect.Iterables;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test141 {
  @Test
  public void test() throws Exception {
    final Gson gson = new Gson();
    final Sample[] json = gson.fromJson(
        new JsonReader(new FileReader("problems/linked-list-cycle/sample.json")),
        Sample[].class);
    for (int i = 0; i < json.length; i++) {
      final Sample sample = json[i];
      final SinglyListNode node = SinglyListNode.of(sample.input.head);
      if (sample.input.pos > -1) {
        Iterables.getLast(node).setNext(Iterables.get(node, sample.input.pos));
      }
      assertEquals(
          sample.explanation,
          sample.output,
          Solution141.RememberVisits.hasCycle(node)
      );
      assertEquals(
          sample.explanation,
          sample.output,
          Solution141.FastSlowPointers.hasCycle(node)
      );
    }
  }

  public static class Sample {
    public Input input;
    public boolean output;
    public String explanation;

    public static class Input {
      public int[] head;
      public int pos;
    }
  }
}
