package files;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/******************************************************************************
 * This example uses a collector to combine all the lines of a file into a 
 * list.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files08 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
        new BufferedReader(new FileReader("data/file-test.txt"));

    List<String> l = r.lines().collect(Collectors.toList());
    
    for(String line: l){
      System.out.println(line);
    }
    
    r.close();
  }

}
