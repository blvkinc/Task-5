package experiments;

import java.util.*;
import java.util.function.Function;

/******************************************************************************
 * This version does the same as the last except it is more explicit about the
 * Function implementation.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment12 {
  class ERemover implements Function<String, String> {
    public String apply(String name) {
      return name.replaceAll("e", "");
    }
  }
  
  public void run() {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);

    n2.stream().map(new ERemover())
        .forEach(name -> System.out.println(name));

  }

  public static void main(String[] args) {
    new Experiment12().run();
  }
}
