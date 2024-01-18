package experiments;

import java.util.stream.Stream;

/******************************************************************************
 * This version uses a StreamBuilder to generate a Stream of Names.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment14 {
  class NameStreamBuilder {
    public Stream<String> build(){
      Stream.Builder<String> builder = Stream.builder(); 
      builder.add("Kevan");
      builder.add("John");
      builder.add("Matthew");
      return builder.build();
    }
  }
  
  public void run() {
    NameStreamBuilder builder = new NameStreamBuilder();
    Stream <String> nameStream = builder.build();
    nameStream.forEach(n -> System.out.println(n));
  }

  public static void main(String[] args) {
    new Experiment14().run();
  }
}
