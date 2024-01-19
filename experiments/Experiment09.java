package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Experiment09 {
  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using a Predicate to filter names containing the character 'i'
    long startTimeSequential = System.currentTimeMillis();
    namesList.stream().filter(name -> name.contains("i"))
                     .forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Using a Predicate to filter names containing the character 'i' in parallel
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().filter(name -> name.contains("i"))
                              .forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment09().run();
  }
}
