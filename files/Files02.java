package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files02 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data/file-test.txt"));

        // Sequential stream processing to count lines
        long countSequential = reader.lines().count();
        System.out.println("Sequential Line Count: " + countSequential);

        // Reset the reader as streams cannot be reused
        reader = new BufferedReader(new FileReader("data/file-test.txt"));

        // Parallel stream processing to count lines
        long countParallel = reader.lines().parallel().count();
        System.out.println("Parallel Line Count: " + countParallel);

        reader.close();
    }
}
