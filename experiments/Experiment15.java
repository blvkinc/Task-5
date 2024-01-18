package experiments;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/******************************************************************************
 * Another example of implementing a functional interface. This is included
 * because it shows a function that returns a different type to its input.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment15 {
  public static void main(String[] args) {
    Function<Integer, Double> reciprocal = new Function<Integer, Double>() {
      public Double apply(Integer n) {
        return 1.0 / n;
      }
    };
    System.out.println(reciprocal.apply(10));

    IntStream denominators = IntStream.range(1, 10);
    denominators.map((IntUnaryOperator) reciprocal)
        .forEach(x -> System.out.println(x));
  }
}
