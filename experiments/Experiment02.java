package experiments;

/******************************************************************************
 * This program uses a foreach loop which is less error prone as it eliminates
 * the need for a loop control variable. 
 *  
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment02 {
  public static void main(String[] args) {
    String[] n1 = { "Kevan", "John", "Matthew" };

    for (String name : n1) {
      System.out.println(name);
    }
  }
}
