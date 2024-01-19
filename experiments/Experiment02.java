package experiments;

import java.util.Arrays;

public class Experiment02 {
  public static void main(String[] args) {
    String[] names = {"Steve", "David", "Matt"};

    // Using enhanced for loop (for-each loop)
    long startTime = System.currentTimeMillis();
    for (String name : names) {
      System.out.println(name);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Foreach Loop Time: " + (endTime - startTime) + " ms");

    // Using Java Streams for sequential processing
    startTime = System.currentTimeMillis();
    Arrays.stream(names)
          .forEach(System.out::println);
    endTime = System.currentTimeMillis();
    System.out.println("Stream Sequential Time: " + (endTime - startTime) + " ms");

    // Using Java Streams for parallel processing
    startTime = System.currentTimeMillis();
    Arrays.stream(names)
          .parallel()
          .forEach(System.out::println);
    endTime = System.currentTimeMillis();
    System.out.println("Stream Parallel Time: " + (endTime - startTime) + " ms");
  }
}
