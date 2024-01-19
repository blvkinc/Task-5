package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using stream for sequential processing
    System.out.println("Serial names\n---------");
    long startTime = System.currentTimeMillis();
    namesList.stream().forEach(name -> System.out.println(name));
    long endTime = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTime - startTime) + " ms");

    // Using parallel stream for concurrent processing
    System.out.println("\nParallel names\n---------");
    startTime = System.currentTimeMillis();
    namesList.parallelStream().forEach(name -> System.out.println(name));
    endTime = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTime - startTime) + " ms");
  }

  public static void main(String[] args) {
    new Experiment08().run();
  }
}
