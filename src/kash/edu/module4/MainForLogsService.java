package kash.edu.module4;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  MainForLogsService
  @version  1.0.0 
  @since 15.04.2021 - 17.33
**/

/*               TASK: Multithreading
    1. Use the file from the previous task - logs.txt.
    2. Create a class that manages logs in this file.
    3. Create a method that finds all the ERROR logs
    for a specific date and write them into a specific
    file (name = ERROR  + Date  + .log)
    4. In your main class develop a functionality to
    create  5 such a files for 5 different days.
    Launch them in consistent way (one after another).
    5. Repeat the above  task in parallel way. Multi-threading.
    6. Compare the results.
*/

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MainForLogsService {

    public static void main(String[] args) throws IOException {

        // ---------------------------- Sequential Approach --------------------------------

        LocalDateTime start = LocalDateTime.now();
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 10);

        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
                    date.plusDays(i));
        }

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Sequential Approach: "
                + ChronoUnit.MILLIS.between(start, finish) + " msec"); // 4795 msec

        // ---------------------- Parallel Approach (Multithreading) -----------------------

        for (int l = 0; l < 5; l++) {
            new MyThread("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
                    date.plusDays(l)).start();
        }
    }
}
// -------------------------------- OUTPUT --------------------------------
/* Conclusions: the usage of parallel approach (multithreading) shows better
   results in terms of time consuming in comparison to the usage of sequential
   approach.

--> Sequential Approach: 4790 msec
--> Parallel Approach (Multithreading): 1325 msec

    Thread-1 has been started at 2021-04-15T18:35:29.409
    Thread-2 has been started at 2021-04-15T18:35:29.409
    Thread-4 has been started at 2021-04-15T18:35:29.409
    Thread-0 has been started at 2021-04-15T18:35:29.409
    Thread-3 has been started at 2021-04-15T18:35:29.409
    Thread-3 has been finished at 2021-04-15T18:35:30.666
    Thread-3 DURATION is 1257 msec
    Thread-1 has been finished at 2021-04-15T18:35:30.687
    Thread-1 DURATION is 1278 msec
    Thread-2 has been finished at 2021-04-15T18:35:30.689
    Thread-2 DURATION is 1280 msec
    Thread-0 has been finished at 2021-04-15T18:35:30.725
    Thread-0 DURATION is 1316 msec
    Thread-4 has been finished at 2021-04-15T18:35:30.734
    Thread-4 DURATION is 1325 msec
*/
