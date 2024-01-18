package experiments;

import java.util.*;

/******************************************************************************
 * In this code the array is converted to a List so that advantages of the 
 * Collections API my used later.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment03 {
  public static void main(String[] args) {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  
    System.out.println(n2.getClass());

    
    for(String name:n2) {
      System.out.println(name);
    }
  }
}
