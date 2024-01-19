package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment06 {
  class StringPrintConsumer implements Consumer<String> {
    public void accept(String str) {
      System.out.println(str);
    }
  }

  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using explicit interface implementation
    long startTime = System.currentTimeMillis();
    namesList.forEach(new StringPrintConsumer());
    long endTime = System.currentTimeMillis();
    System.out.println("Explicit Interface Implementation Time: " + (endTime - startTime) + " ms");
  }

  public static void main(String[] args) {
    new Experiment06().run();
  }
}
