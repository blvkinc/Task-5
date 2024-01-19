package files;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Files08 {

  public static void main(String[] args) throws Exception {
    long startTime = System.nanoTime();

    // Sequential Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      List<String> lines = reader.lines().collect(Collectors.toList());

      for (String line : lines) {
        System.out.println(line);
      }
    }

    long endTime = System.nanoTime();
    long sequentialTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Sequential Processing Time: " + sequentialTime + " milliseconds");

    // Reset start time for parallel processing
    startTime = System.nanoTime();

    // Parallel Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      List<String> lines = reader.lines().parallel().collect(Collectors.toList());

      lines.forEach(System.out::println);
    }

    endTime = System.nanoTime();
    long parallelTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Parallel Processing Time: " + parallelTime + " milliseconds");
  }
}
