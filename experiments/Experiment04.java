package experiments;

import java.lang.reflect.Method;
import java.util.*;

/******************************************************************************
 * In this code the array is converted to a List and the methods available to 
 * are listed using reflection. Note this is an immutable list so methods
 * such as add, which are defined in the List interface are not available. To
 * proved this try adding a name to the list (uncomment the code below).
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment04 {
  public static void main(String[] args) {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  
    System.out.println(n2.getClass());

    for(Method m: n2.getClass().getDeclaredMethods()) {
      System.out.println(m.getName());
    }
//    n2.add("new name");
  }
}
