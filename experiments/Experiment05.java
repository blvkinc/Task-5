package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
  public static void main(String[] args) {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using declarative style programming with lambda expression
    long startTime = System.currentTimeMillis();
    namesList.forEach(name -> System.out.println(name));
    long endTime = System.currentTimeMillis();
    System.out.println("Declarative Style Time: " + (endTime - startTime) + " ms");
  }
}
