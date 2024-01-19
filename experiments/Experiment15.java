package experiments;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Experiment15 {
  public static void main(String[] args) {
    Function<Integer, Double> reciprocalFunction = n -> 1.0 / n;
    System.out.println("Reciprocal of 10: " + reciprocalFunction.apply(10));

    IntStream denominators = IntStream.range(1, 10);

    // Sequential stream processing
    long startTimeSequential = System.currentTimeMillis();
    denominators.mapToDouble(reciprocalFunction::apply)
               .forEach(x -> System.out.println("Sequential: " + x));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Parallel stream processing
    long startTimeParallel = System.currentTimeMillis();
    denominators.parallel().mapToDouble(reciprocalFunction::apply)
                          .forEach(x -> System.out.println("Parallel: " + x));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }
}
