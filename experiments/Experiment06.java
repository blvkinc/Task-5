package experiments;

import java.util.*;
import java.util.function.Consumer;

/******************************************************************************
 * This version is similar to the last but the interface implementation is
 * done more explicity. To do this the custom consumer has to implement the 
 * accept method.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment06 {
  class StringPrintConsumer implements Consumer<String>{
    public void accept(String str) {
      System.out.println(str);     
    } 
  }
  
  public void run() {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  

    n2.forEach(new StringPrintConsumer());
  }
  
  public static void main(String[] args) {
    new Experiment06().run();
  }
}
