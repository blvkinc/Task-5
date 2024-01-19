package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files03 {

    
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"));

    // Sequential stream processing to print lines containing "Fox" and measure time
    long startTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream:");
    reader.lines().filter(line -> line.contains("Fox"))
            .forEach(line -> System.out.println(line));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Reset the reader as streams cannot be reused
    reader = new BufferedReader(new FileReader("data/file-test.txt"));

    // Parallel stream processing to print lines containing "Fox" and measure time
    long startTimeParallel = System.currentTimeMillis();
    System.out.println("\nParallel Stream:");
    reader.lines().parallel().filter(line -> line.contains("Fox"))
            .forEach(line -> System.out.println(line));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");

    reader.close();
}
}