package files;

import java.io.*;

/******************************************************************************
 * This program reads a text file and only prints the lines containing the word
 * "Fox".
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Files03 {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"));

    reader.lines().filter(line -> line.contains("Fox"))
        .forEach(line -> System.out.println(line));

    reader.close();
  }

}
