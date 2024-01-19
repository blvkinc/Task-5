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
    long startTimeExplicit = System.currentTimeMillis();
    namesList.forEach(new StringPrintConsumer());
    long endTimeExplicit = System.currentTimeMillis();
    System.out.println("Explicit Interface Implementation Time: " + (endTimeExplicit - startTimeExplicit) + " ms");

    // Using parallel stream
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().forEach(new StringPrintConsumer());
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");

    // Using stream
    long startTimeStream = System.currentTimeMillis();
    namesList.stream().forEach(new StringPrintConsumer());
    long endTimeStream = System.currentTimeMillis();
    System.out.println("Stream Time: " + (endTimeStream - startTimeStream) + " ms");
  }

  public static void main(String[] args) {
    new Experiment06().run();
  }
}
