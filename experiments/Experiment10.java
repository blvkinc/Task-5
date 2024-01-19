package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Experiment10 {
  class EFilter implements Predicate<String> {
    public boolean test(String name) {
      return name.contains("e");
    }    
  }

  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using a Predicate for filtering names containing the character 'e'
    long startTimeSequential = System.currentTimeMillis();
    namesList.stream().filter(new EFilter())
                     .forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Using a Predicate for filtering names containing the character 'e' in parallel
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().filter(new EFilter())
                              .forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment10().run();
  }
}
