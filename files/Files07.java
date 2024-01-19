package files;

import java.io.*;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class Files07 {

  public static void main(String[] args) throws Exception {
    long startTime = System.nanoTime();

    // Sequential Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      Optional<String> result = reader.lines().reduce((left, right) -> left.concat(" ".concat(right)));
    
      if (result.isPresent())
        System.out.println("Result is " + result.get());
      else
        System.out.println("Result not present");
    }

    long endTime = System.nanoTime();
    long sequentialTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Sequential Processing Time: " + sequentialTime + " milliseconds");

    // Reset start time for parallel processing
    startTime = System.nanoTime();

    // Parallel Processing
    try (BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"))) {
      Optional<String> result = reader.lines().parallel().reduce((left, right) -> left.concat(" ".concat(right)));
    
      if (result.isPresent())
        System.out.println("Result is " + result.get());
      else
        System.out.println("Result not present");
    }

    endTime = System.nanoTime();
    long parallelTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    System.out.println("Parallel Processing Time: " + parallelTime + " milliseconds");
  }

}
