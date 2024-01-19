package experiments;

import java.util.Arrays;

public class Experiment01 {
  public static void main(String[] args) {
    String[] names = {"Steve", "David", "Matt"};

    System.out.println(names.getClass());

    // Using traditional for loop
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Sequential Time: " + (endTime - startTime) + " ms");

    // Using enhanced for loop (for-each loop)
    startTime = System.currentTimeMillis();
    for (String name : names) {
      System.out.println(name);
    }
    endTime = System.currentTimeMillis();
    System.out.println("Sequential Time: " + (endTime - startTime) + " ms");

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
