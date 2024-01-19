package experiments;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Experiment13 {
  class NameSupplier implements Supplier<String> {
    String[] names = {"Steve", "David", "Matt"};
    int nextIndex = 0;
    
    public String get() {
      if (nextIndex < names.length) {
        return names[nextIndex++];
      }
      return null;
    }  
  }

  public void run() {
    NameSupplier nameSupplier = new NameSupplier();

    // Sequential stream processing
    long startTimeSequential = System.currentTimeMillis();
    Stream.generate(nameSupplier)
          .limit(4)
          .forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Parallel stream processing
    long startTimeParallel = System.currentTimeMillis();
    Stream.generate(nameSupplier)
          .parallel()
          .limit(4)
          .forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment13().run();
  }
}
