package experiments;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Experiment16 {
  public static void main(String[] args) {
    Supplier<LocalDate> dateSupplier = LocalDate::now;

    // Sequential stream processing
    long startTimeSequential = System.currentTimeMillis();
    Stream.generate(dateSupplier)
          .limit(5)
          .forEach(date -> System.out.printf("Sequential: %s\n", date));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Parallel stream processing
    long startTimeParallel = System.currentTimeMillis();
    Stream.generate(dateSupplier)
          .parallel()
          .limit(5)
          .forEach(date -> System.out.printf("Parallel: %s\n", date));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }
}
