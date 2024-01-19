package experiments;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Experiment04 {
  public static void main(String[] args) {
    String[] namesArray = {"Steve", "David", "Matt"};

    // Convert array to List using Arrays.asList()
    List<String> namesList = Arrays.asList(namesArray);
    System.out.println(namesList.getClass());

    // Using reflection to list methods available on the List
    for (Method method : namesList.getClass().getDeclaredMethods()) {
      System.out.println(method.getName());
    }

    // Uncommenting the code below will result in an UnsupportedOperationException
    // as Arrays.asList() returns a fixed-size list (immutable).
    // namesList.add("new name");
  }
}
