package files;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Files01 {
    public static void main(String[] args) {
        Supplier<LocalDate> dateSupplier = LocalDate::now;

        // Sequential stream processing
        long startTimeSequential = System.currentTimeMillis();
        Stream.generate(dateSupplier)
              .limit(5)
              .forEach(date -> System.out.printf("Sequential Processing: %s\n", date));
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

        // Parallel stream processing
        long startTimeParallel = System.currentTimeMillis();
        Stream.generate(dateSupplier)
              .parallel()
              .limit(5)
              .forEach(date -> System.out.printf("Parallel Processing: %s\n", date));
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
    }
}
