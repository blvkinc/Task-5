package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Experiment03 {
  public static void main(String[] args) {
    String[] namesArray = {"Steve", "David", "Matt"};

    // Convert array to List using Arrays.asList()
    List<String> namesList = Arrays.asList(namesArray);
    System.out.println(namesList.getClass());

    // Using enhanced for loop (for-each loop) on List
    long startTime = System.currentTimeMillis();
    for (String name : namesList) {
      System.out.println(name);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Foreach Loop Time: " + (endTime - startTime) + " ms");

    // Using Java Streams to convert array to List
    startTime = System.currentTimeMillis();
    List<String> namesStreamList = Arrays.stream(namesArray)
                                        .collect(Collectors.toList());
    endTime = System.currentTimeMillis();
    System.out.println(namesStreamList.getClass());

    // Using Java Streams for sequential processing on List
    startTime = System.currentTimeMillis();
    namesStreamList.forEach(System.out::println);
    endTime = System.currentTimeMillis();
    System.out.println("Stream Sequential Time: " + (endTime - startTime) + " ms");

    // Using Java Streams for parallel processing on List
    startTime = System.currentTimeMillis();
    namesStreamList.parallelStream()
                   .forEach(System.out::println);
    endTime = System.currentTimeMillis();
    System.out.println("Stream Parallel Time: " + (endTime - startTime) + " ms");
  }
}
