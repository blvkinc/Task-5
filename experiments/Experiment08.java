package experiments;

import java.util.*;

/******************************************************************************
 * This version uses a stream then a parallel stream to process the data. Note
 * that in the first version the names are printed in the order that they are 
 * stored in the list. In the second version the data is processed concurrently
 * so the order the names are printed cannot be determined. This demonstrates
 * that if we have a problem in which the order of the data is processed does
 * not matter then parallelism can be taken advantage of.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment08 {

 public void run() {
    String[] n1 = { "Kevan", "John", "Matthew" };

    List<String> n2 = Arrays.asList(n1);  

    System.out.println("Serial names\n---------");
    n2.stream().forEach(name -> System.out.println(name));

    System.out.println("\nParallel names\n---------");
    n2.parallelStream().forEach(name -> System.out.println(name));
  }

  public static void main(String[] args) {
    new Experiment08().run();
  }
}
