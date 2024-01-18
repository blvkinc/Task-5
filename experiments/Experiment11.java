package experiments;

import java.util.*;

/******************************************************************************
 * This version introduces the use of a Function. A function takes a parameter
 * and returns a result. In this case all occurrences of the lowercase letter e 
 * are removed from the names. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment11 {

  public void run() {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);

    n2.stream().map(name -> name.replaceAll("e", ""))
        .forEach(name -> System.out.println(name));

  }

  public static void main(String[] args) {
    new Experiment11().run();
  }
}
