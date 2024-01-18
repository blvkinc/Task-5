package experiments;

import java.util.*;

/******************************************************************************
 * This version moves from imperative style to declarative style programming.
 * The explicit loop is removed and a lamba expression is used to implement 
 * what was previously the body of a loop. A lamba expression is function
 * that can be passed as a parameter and does not have a name. Here the lambda
 * implements the Consumer interface, which takes a single parameter and 
 * produces no return value. 
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment05 {
  public static void main(String[] args) {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  

    n2.forEach(name -> System.out.println(name));
  }
}
