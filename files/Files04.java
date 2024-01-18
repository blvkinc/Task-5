package files;

import java.io.*;

/******************************************************************************
 * This program uses a map to convert a text file to upper case.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files04 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
        new BufferedReader(new FileReader("data/file-test.txt"));

    r.lines()
     .map(l -> l.toUpperCase())
     .forEach(l -> System.out.println(l));
    
    r.close();
  }

}
