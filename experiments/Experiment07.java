package experiments;

import java.util.*;
import java.util.function.Consumer;

/******************************************************************************
 * This version is similar to the last but uses an anonymous inner class.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment07 {

 public void run() {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  

    n2.forEach(new Consumer<String>() {
      public void accept(String str) {
        System.out.println(str);     
      }
    });
  }

  public static void main(String[] args) {
    new Experiment07().run();
  }
}
