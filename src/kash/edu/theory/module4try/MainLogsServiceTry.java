package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  MainLogsServiceTry
  @version  1.0.0 
  @since 12.04.2021 - 18.25
*/

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MainLogsServiceTry {
    public static void main(String[] args) throws IOException {
        // ---------------------- Logs: General info -----------------------------
        // print total number of logs on a particular date
        // logsByDate - static method --> can create without creation of class object
        System.out.println(LogsServiceTry.logsByDate("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
                LocalDate.of(2020, Month.FEBRUARY, 10)).size() + " logs"); // 6987 logs

        // ---------------------- sequential approach - последовательный подход -----------------------------
        // find all the ERROR logs for a specific date and write them into a specific file
        LocalDateTime start = LocalDateTime.now();
        // LogsServiceTry.logsByDateToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
        //        LocalDate.of(2020, Month.FEBRUARY, 14));
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 10);
        for (int i = 0; i < 5; i++) {
            LogsServiceTry.logsByDateToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt", date.plusDays(i));
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " msec"); // 4795 msec


        // ---------------------- Threads: General info (1)  -----------------------------
        // works without constructors and getters & setters in class MyThreadTry
        // for (int k = 0; k < 10; k++) {
        //     new MyThreadTry().start();
        // }
        // OUTPUT: (unpredictable), but make parallel flows
        // Thread-0 Thread-1 Thread-5 Thread-2 Thread-4 Thread-7 Thread-8 Thread-3 Thread-6 Thread-9


        // ---------------------- parallel approach - Multithreading (Variant 1) -----------------------------
        // print total number of logs on a particular date
        // to run it need to change the void method getLogsCountByDate in LogsServiceTry2 into int (+ add return)
/*      start = LocalDateTime.now();

        date = LocalDate.of(2020, Month.FEBRUARY, 10);
        for (int j = 0; j < 5; j++) {
            System.out.print(date.plusDays(j) + " - ");
            System.out.println(LogsServiceTry2.getLogsCountByDate(date.plusDays(j)));
        }

        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " msec"); // 4774 msec*/
/*
        OUTPUT:
        2020-02-10 - 6987
        2020-02-11 - 7086
        2020-02-12 - 4731
        2020-02-13 - 4817
        2020-02-14 - 5315
*/

        // ---------------------- parallel approach - Multithreading (Variant 2) -----------------------------
        for (int l = 0; l < 5; l++) {
            new MyThreadTry(date.plusDays(l)).start();
        }
/*
        OUTPUT:
        Thread-0 has been started at 2021-04-15T17:08:18.280
        Thread-2 has been started at 2021-04-15T17:08:18.280
        Thread-1 has been started at 2021-04-15T17:08:18.280
        Thread-3 has been started at 2021-04-15T17:08:18.280
        Thread-4 has been started at 2021-04-15T17:08:18.280
        2020-02-13 - 4817
        Thread-3 has been finished at 2021-04-15T17:08:19.507
        Thread-3 DURATION is 1227
        2020-02-12 - 4731
        Thread-2 has been finished at 2021-04-15T17:08:19.572
        Thread-2 DURATION is 1292
        2020-02-11 - 7086
        Thread-1 has been finished at 2021-04-15T17:08:19.601
        Thread-1 DURATION is 1321
        2020-02-10 - 6987
        Thread-0 has been finished at 2021-04-15T17:08:19.647
        Thread-0 DURATION is 1367
        2020-02-14 - 5315
        Thread-4 has been finished at 2021-04-15T17:08:19.675
        Thread-4 DURATION is 1395
*/
        // total time of all threads (difference between start of 1st and finish of the last one) about 6 sec
        // put in conclusion that usage of Multithreading reduces time it two times
    }
}
