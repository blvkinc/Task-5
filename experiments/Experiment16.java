package experiments;

import java.time.LocalDate;
import java.util.function.Supplier;

/******************************************************************************
 * This is another example of using a supplier. Suppliers will be used like 
 * this in realtime applications for capturing things like sensor readings.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class Experiment16 {
  public static void main(String[] args) {
    Supplier<String> dateSupplier = new Supplier<String>() {
      public String get() {
        LocalDate date = LocalDate.now(); 
        return date.toString();
      }
    };  
    System.out.printf("Today is %s", dateSupplier.get());
  }
}
