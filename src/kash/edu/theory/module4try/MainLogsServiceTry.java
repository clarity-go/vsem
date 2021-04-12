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
        // ---------------------- Logs -----------------------------
        // static method, create without creation of class object

        //System.out.println(LogsServiceTry.logsByDate("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
        //        LocalDate.of(2020, Month.FEBRUARY, 14)).size()); // 2020, Month.FEBRUARY, 13 - 5315

        /*
        LogsServiceTry.logsByDateToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt",
                LocalDate.of(2020, Month.FEBRUARY, 14));
        */


        LocalDateTime start = LocalDateTime.now();

        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 14);
        for (int i = 0; i < 5; i++) {
            LogsServiceTry.logsByDateToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt", date.plusDays(i));
        }

        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish)); // 5315 msec

        // ---------------------- Threads -----------------------------
//        for (int i = 0; i < 10; i++) {
//            new MyThreadTry().start();

/*
            OUTPUT: (unpredictable), but make parallel flows
            Thread-0
            Thread-1
            Thread-5
            Thread-2
            Thread-4
            Thread-7
            Thread-8
            Thread-3
            Thread-6
            Thread-9
*/
        // ---------------------- Threads -----------------------------
        start = LocalDateTime.now();

        date = LocalDate.of(2020, Month.FEBRUARY, 10);
        for (int j = 0; j < 5; j++) {
            System.out.print(date.plusDays(j) + " - ");
            System.out.println(LogsServiceTry2.getLogsCountByDate(date.plusDays(j)));
        }

        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " msec"); // 5315 msec


        // ---------------------- Threads -----------------------------
        start = LocalDateTime.now();

        for (int l = 0; l < 5; l++) {
            new MyThreadTry(date.plusDays(l)).start();
        }

        // total time of all threads (difference between start of 1st and finish of the last one) about 6 sec
        // put in conclusion that usage of Multithreading reduces time it two times
    }
}
