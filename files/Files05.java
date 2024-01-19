package files;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Files05 {

  public static void main(String[] args) throws Exception {
    long startTime = System.nanoTime();

    // Sequential Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      reader.lines()
            .sorted((a, b) -> Integer.compare(b.length(), a.length()))
            .forEach(System.out::println);
    }

    long endTime = System.nanoTime();
    long sequentialTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Sequential Processing Time: " + sequentialTime + " milliseconds");

    // Reset start time for parallel processing
    startTime = System.nanoTime();

    // Parallel Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      reader.lines()
            .parallel()
            .sorted((a, b) -> Integer.compare(b.length(), a.length()))
            .forEach(System.out::println);
    }

    endTime = System.nanoTime();
    long parallelTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Parallel Processing Time: " + parallelTime + " milliseconds");
  }

}
