package kash.edu.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  FilesManagement
  @version  1.0.0 
  @since 10.04.2021 - 20.47
**/

/*                   TASK: Files management
    1. Parse the file logs.txt (see the attachment).
    Extract to a separate file all the logs.
    2. Calculate the total number of logs (lines).
    3. Calculate the total  number of  ERROR logs.
    Use previous skills - String.split
    4.  Calculate the total number of ERROR logs.
    Use Files.lines.
    5. Compare two results.
*/

public class FilesManagement {
    public static void main(String[] args) throws IOException {
        // -------------------------------- WAY 1 --------------------------------
        // Calculate the total  number of  ERROR logs using String.split

        LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt")));
        final String[] lines = logs.split("\n");

        System.out.println("The total number of logs: " + lines.length);

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR")) counter ++;
        }
        System.out.println(" WAY 1 (String.split): \nNumber of ERROR logs: " + counter);

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec");

        // -------------------------------- WAY 2 --------------------------------
        // Calculate the total number of ERROR logs using Files.readAllLines

        start = LocalDateTime.now();

        System.out.println(" WAY 2 (Files.readAllLines): \nNumber of ERROR logs: "
                + Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec");

        // -------------------------------- WAY 3 --------------------------------
        // Calculate the total number of ERROR logs using Files.lines
        start = LocalDateTime.now();

        System.out.println(" WAY 3 (Files.lines): \nNumber of ERROR logs: "
                + Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt"))
                .filter(line1 -> line1.contains("ERROR")).count());

        finish = LocalDateTime.now();
        System.out.println("Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec");

    }
}

// -------------------------------- OUTPUT --------------------------------
/* Conclusions: the usage of Files.lines shows better results in terms of
   time consuming in comparison to the usage of String.split.

    The total number of logs: 2845607

        WAY 1 (String.split):
    Number of ERROR logs: 361
    Time: 3554 msec

        WAY 2 (Files.readAllLines):
    Number of ERROR logs: 361
    Time: 3364 msec

        WAY 3 (Files.lines):
    Number of ERROR logs: 361
    Time: 1149 msec
*/
