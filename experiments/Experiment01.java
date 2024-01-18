package experiments;

/******************************************************************************
 * This program demonstrates the imperative way of storing some data and 
 * processing it.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment01 {
  public static void main(String[] args) {
    String [] n1 = {"Kevan", "John", "Matthew"};

    System.out.println(n1.getClass());
    
    for(int i=0;i<n1.length;i++) {
      System.out.println(n1[i]);
    }
  }
}
