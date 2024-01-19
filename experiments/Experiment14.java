package experiments;

import java.util.stream.Stream;

public class Experiment14 {
  class NameStreamBuilder {
    public Stream<String> build() {
      Stream.Builder<String> streamBuilder = Stream.builder(); 
      streamBuilder.add("Steve");
      streamBuilder.add("David");
      streamBuilder.add("Matt");
      return streamBuilder.build();
    }
  }

  public void run() {
    NameStreamBuilder nameStreamBuilder = new NameStreamBuilder();
    Stream<String> nameStream = nameStreamBuilder.build();

    // Sequential stream processing
    long startTimeSequential = System.currentTimeMillis();
    nameStream.forEach(name -> System.out.println("Sequential: " + name));
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

    // Parallel stream processing
    long startTimeParallel = System.currentTimeMillis();
    nameStream.parallel().forEach(name -> System.out.println("Parallel: " + name));
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
  }

  public static void main(String[] args) {
    new Experiment14().run();
  }
}
