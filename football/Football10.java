package football;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Football10 {
    public static void main(String[] args) {
        List<Club> clubList = Arrays.asList(
            new Club(1, "Real Madrid", 22, 16, 1, 5, 80, 30, 50, 10, 5, 20, 2, 76),
            new Club(2, "Barcelona", 22, 16, 0, 6, 75, 35, 40, 8, 3, 15, 2, 75),
            new Club(3, "Atletico Madrid", 22, 15, 1, 6, 60, 40, 20, 12, 4, 10, 2, 68),
            new Club(4, "Real Sociedad", 22, 14, 1, 7, 70, 45, 25, 15, 5, 10, 5, 68),
            new Club(5, "Sevilla", 22, 14, 0, 8, 65, 50, 15, 14, 6, 10, 7, 68),
            new Club(6, "Valencia", 22, 11, 2, 9, 72, 57, 15, 20, 8, 15, 4, 61),
            new Club(7, "Villarreal", 22, 11, 0, 11, 50, 48, 2, 16, 10, 8, 4, 54),
            new Club(8, "Athletic Bilbao", 22, 10, 0, 12, 44, 51, -7, 18, 12, 6, 5, 49),
            new Club(9, "Real Betis", 22, 9, 1, 12, 55, 57, -2, 22, 15, 5, 6, 48),
            new Club(10, "Getafe", 22, 7, 1, 14, 42, 58, -16, 18, 17, 5, 6, 40),
            new Club(11, "Eibar", 22, 5, 1, 16, 47, 54, -7, 21, 20, 4, 8, 34),
            new Club(12, "Leganes", 22, 0, 0, 22, 22, 60, -38, 15, 25, 1, 0, 1)
        );
        long startTimeSequential = System.currentTimeMillis();

        // Example: Finding clubs with the lowest number of fouls committed using sequential stream
        List<Club> fairPlayClubsSequential = clubList.stream()
                .sorted(Comparator.comparingInt(Club::getFoulsCommitted))
                .limit(3)  // Top 3 clubs with the lowest number of fouls committed
                .collect(Collectors.toList());

        long endTimeSequential = System.currentTimeMillis();

        System.out.println("Fair Play Clubs with Lowest Fouls Committed (Sequential):");
        fairPlayClubsSequential.forEach(System.out::println);
        System.out.println("Sequential Execution Time: " + (endTimeSequential - startTimeSequential) + " ms");

        long startTimeParallel = System.currentTimeMillis();

        // Example: Finding clubs with the lowest number of fouls committed using parallel stream
        List<Club> fairPlayClubsParallel = clubList.parallelStream()
                .sorted(Comparator.comparingInt(Club::getFoulsCommitted))
                .limit(3)  // Top 3 clubs with the lowest number of fouls committed
                .collect(Collectors.toList());

        long endTimeParallel = System.currentTimeMillis();

        System.out.println("\nFair Play Clubs with Lowest Fouls Committed (Parallel):");
        fairPlayClubsParallel.forEach(System.out::println);
        System.out.println("Parallel Execution Time: " + (endTimeParallel - startTimeParallel) + " ms");
    }
}