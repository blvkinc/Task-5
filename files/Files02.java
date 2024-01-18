package files;

import java.io.*;

/******************************************************************************
 * This program counts the number of lines in a text file.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files02 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
      new BufferedReader(new FileReader("data/file-test.txt"));

    System.out.println(r.lines().count());

    r.close();
  }

}
