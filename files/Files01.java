package files;

import java.io.*;

/******************************************************************************
 * This code shows how to process all lines of a text file.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files01 {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader("data/file-test.txt"));

    r.lines().forEach(l -> System.out.println(l));

    r.close();
  }

}
