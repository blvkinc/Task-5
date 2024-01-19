package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
  public static void main(String[] args) {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using declarative style programming with lambda expression
    long startTimeDeclarative = System.currentTimeMillis();
    namesList.forEach(name -> System.out.println(name));
    long endTimeDeclarative = System.currentTimeMillis();
    System.out.println("Declarative Style Time: " + (endTimeDeclarative - startTimeDeclarative) + " ms");

    // Using parallel stream
    long startTimeParallel = System.currentTimeMillis();
    namesList.parallelStream().forEach(name -> System.out.println(name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");

    // Using stream
    long startTimeStream = System.currentTimeMillis();
    namesList.stream().forEach(name -> System.out.println(name));
    long endTimeStream = System.currentTimeMillis();
    System.out.println("Stream Time: " + (endTimeStream - startTimeStream) + " ms");
  }
}
