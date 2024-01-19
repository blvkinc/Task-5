package files;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Files06 {

  public static void main(String[] args) throws Exception {
    long startTime = System.nanoTime();

    // Sequential Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      System.out.println(reader.lines().reduce("", String::concat));
    }

    long endTime = System.nanoTime();
    long sequentialTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Sequential Processing Time: " + sequentialTime + " milliseconds");

    // Reset start time for parallel processing
    startTime = System.nanoTime();

    // Parallel Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      System.out.println(reader.lines().parallel().reduce("", String::concat));
    }

    endTime = System.nanoTime();
    long parallelTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Parallel Processing Time: " + parallelTime + " milliseconds");
  }

}
