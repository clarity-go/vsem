package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  MainLogsExam
  @version  1.0.0 
  @since 18.04.2021 - 18.05
*/

import kash.edu.theory.module4try.LogsServiceTry;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class MainLogsExam {
    public static void main(String[] args) throws IOException {
        String myYear = "2020";
        String myMonth = "01";
        String logsByMonth = LogsExam.logsByMonthToFile("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\logs.txt", myYear + "-" + myMonth);

        LogsExam.logsPeriodCount(logsByMonth);
    }
}
