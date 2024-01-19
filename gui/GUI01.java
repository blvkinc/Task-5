package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.PrintStream; // Import the PrintStream class
import java.util.Date;
import java.util.concurrent.CompletableFuture;

public class GUI01 {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    JButton b = new JButton("Press Me");
    f.setLayout(new BorderLayout());
    f.add(b, BorderLayout.CENTER);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        long startTime = System.currentTimeMillis();
        System.out.println("Button says: " + event.getActionCommand());

        // Additional functionality: Print the stream and processing time
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
          printStreamAndProcessingTime(System.out, startTime);
        });

        // Wait for parallel processing to complete
        future.join();
      }
    });

    f.pack();
    f.setVisible(true);
  }

  // Additional method to print stream and processing time
  private static void printStreamAndProcessingTime(PrintStream stream, long startTime) {
    long processingTime = System.currentTimeMillis() - startTime;
    stream.println("Processing Time: " + processingTime + " milliseconds");
  }
}
