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

        LocalDateTime start = LocalDateTime.now();

        String logs = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt")));

        final String[] lines = logs.split("\n");
        // count the total number of logs (lines)
        System.out.println(lines.length); // 197 / 2845607

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish); // 63 / 4044 (4 sec)
        System.out.println(duration);

        // count the total number of ERRORS
        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR")) counter ++;
        }
        System.out.println("ERRORS: " + counter); // 1 / 361

        // -------------------------------- WAY 2 --------------------------------
        // count the total number of ERRORS: Files.lines
        start = LocalDateTime.now();

        final List<String> linesList = Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"));
        // filter lines which contain ERROR with counting
        System.out.println("Way 2: " + linesList.stream().filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println(duration);

        // -------------------------------- WAY 3 --------------------------------
        start = LocalDateTime.now();
        System.out.println(Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());

        // -------------------------------- WAY 4 --------------------------------
//        System.out.println(Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt")
//                .filter(line1 -> line1.contains("ERROR")).count());

        // print all logs (lines) with ERROR
//        System.out.println(Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt")
//                .filter(line1 -> line1.contains("ERROR")).limit(10).forEach(System.out::println);
    }
}
