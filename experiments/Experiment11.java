package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Experiment11 {
  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using a Function to remove all occurrences of the lowercase letter 't'
    long startTimeSequential = System.currentTimeMillis();
    namesList.stream().map(name -> name.replaceAll("t", ""))
                     .forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Using a Function to remove all occurrences of the lowercase letter 't' in parallel
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().map(name -> name.replaceAll("t", ""))
                              .forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment11().run();
  }
}
