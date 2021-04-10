package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  filesManagement
  @version  1.0.0 
  @since 07.04.2021 - 18.57
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class filesManagementTry {
    public static void main(String[] args) throws IOException {
        // -------------------------------- WAY 1 --------------------------------
        // count the total number of ERRORS: Files.split

        LocalDateTime start = LocalDateTime.now();

        String logs = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt")));
        final String[] lines = logs.split("\n");

        // count the total number of logs (lines)
        System.out.println(lines.length); // 197 / 2845607

        // count the total number of ERRORS
        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR")) counter ++;
        }
        System.out.println(" WAY 1: \nNum of errors: " + counter); // 1 / 361

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish); // 63 / 4044 (4 sec)
        System.out.println("Time: " + duration + " msec");

        // -------------------------------- WAY 2 --------------------------------
        // count the total number of ERRORS: Files.lines
        start = LocalDateTime.now();

        final List<String> linesList = Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"));
        // filter lines which contain ERROR with counting
        System.out.println(" WAY 2: \nNum of errors: " + linesList.stream()
                .filter(line -> line.contains("ERROR")).count()); // 361

        finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec"); // 3331 msec

        // ------------------------ WAY 3: combined way 2 -------------------------
        start = LocalDateTime.now();
        System.out.println(" WAY 3: \nNum of errors: " + Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count()); // 361
        finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec"); // 3873 msec

        // -------------------------------- WAY 4 --------------------------------
        // skip creation of a list
        start = LocalDateTime.now();
        System.out.println(" WAY 4: \nNum of errors: " + Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .filter(line1 -> line1.contains("ERROR")).count());
        finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec"); // 1561 msec


        // print first 10 logs (lines) with ERROR
        Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .filter(line1 -> line1.contains("ERROR")).limit(10).forEach(System.out::println);
    }
}
