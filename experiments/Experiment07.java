package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment07 {
  public void run() {
    String[] namesArray = {"Steve", "David", "Matt"};
    List<String> namesList = Arrays.asList(namesArray);

    // Using anonymous inner class
    long startTime = System.currentTimeMillis();
    namesList.forEach(new Consumer<String>() {
      public void accept(String str) {
        System.out.println(str);
      }
    });
    long endTime = System.currentTimeMillis();
    System.out.println("Anonymous Inner Class Time: " + (endTime - startTime) + " ms");
  }

  public static void main(String[] args) {
    new Experiment07().run();
  }
}
