package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment07 {
  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using anonymous inner class
    long startTimeAnonymous = System.currentTimeMillis();
    namesList.forEach(new Consumer<String>() {
      public void accept(String str) {
        System.out.println(str);
      }
    });
    long endTimeAnonymous = System.currentTimeMillis();
    System.out.println("Anonymous Inner Class Time: " + (endTimeAnonymous - startTimeAnonymous) + " ms");

    // Using parallel stream
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().forEach(new Consumer<String>() {
      public void accept(String str) {
        System.out.println(str);
      }
    });
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");

    // Using stream
    long startTimeStream = System.currentTimeMillis();
    namesList.stream().forEach(new Consumer<String>() {
      public void accept(String str) {
        System.out.println(str);
      }
    });
    long endTimeStream = System.currentTimeMillis();
    System.out.println("Stream Time: " + (endTimeStream - startTimeStream) + " ms");
  }

  public static void main(String[] args) {
    new Experiment07().run();
  }
}
