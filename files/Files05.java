package files;

import java.io.*;

/******************************************************************************
 * This program sorts the lines of a file so that the shortest lines are 
 * output last.
 *  
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files05 {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader("data/file-test.txt"));

    r.lines().sorted((a, b) -> {
      if (a.length() == b.length())
        return 0;
      if (a.length() < b.length())
        return 1;
      return -1;
    }).forEach(l -> System.out.println(l));

    r.close();
  }

}
