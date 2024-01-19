package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Experiment12 {
  class ERemover implements Function<String, String> {
    public String apply(String name) {
      return name.replaceAll("e", "");
    }
  }

  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using an explicit Function to remove all occurrences of the lowercase letter 'e'
    long startTimeSequential = System.currentTimeMillis();
    namesList.stream().map(new ERemover())
                     .forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Using an explicit Function to remove all occurrences of the lowercase letter 'e' in parallel
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().map(new ERemover())
                              .forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment12().run();
  }
}
