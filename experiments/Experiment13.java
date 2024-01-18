package experiments;

import java.util.function.Supplier;

/******************************************************************************
 * This version uses a Supplier to generate names;
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment13 {
  class NameSupplier implements Supplier<String>{
    String[] names = { "Kevan", "John", "Matthew" };
    int nextIndex = 0;
    public String get() {
      if(nextIndex< names.length) {
        return names[nextIndex++];
      }
      return null;
    }  
  }
  
  public void run() {
    NameSupplier ns = new NameSupplier();

    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
  }

  public static void main(String[] args) {
    new Experiment13().run();
  }
}
