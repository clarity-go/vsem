package kash.edu.theory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  LogsExam
  @version  1.0.0 
  @since 18.04.2021 - 18.01
*/

import kash.edu.theory.module3try.collectionsTry.Gender;
import kash.edu.theory.module3try.collectionsTry.StudentForCols;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class LogsExam {
    private final static String file = "C:/Users/Lenovo/Desktop/MY/Java/logs.txt";

    public LogsExam() {
    }

    public static String logsByMonthToFile(String file, String period) throws IOException {
        //String dateAsString = date.toString(); // convert data to string, for example: "2021-03-18"
        String str = "";
        StringBuilder sb = new StringBuilder(str);

        Files.lines(Paths.get(file))
                .filter(log -> log.contains("ERROR"))
                .filter(log -> log.contains(period))
                .forEach(log -> sb.append(log + '\n'));

        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "ERROR " + period + ".log";
        Files.write(Paths.get(fileOutput), sb.toString().getBytes());
        return fileOutput;

    }

    public static void logsPeriodCount(String file) throws IOException {

        // Define the logs' dates
        String newString = "";
        StringBuilder sb = new StringBuilder(newString);
        Files.lines(Paths.get(file)).forEach(log -> sb.append(log.substring(0,10) + '\n'));

        //String dates = sb.toString();
        List<String> listOfDates = new ArrayList<String>(Arrays.asList(sb.toString().split("\n")));

        // Convert String into LocalDate
        List<LocalDate> listOfLocalDates = new ArrayList();
        for (int i = 0; i < listOfDates.size(); i++) {
            listOfLocalDates.add(LocalDate.parse(listOfDates.get(i)));
        }

        // Get Max Date
        LocalDate maxDate = listOfLocalDates.stream()
                .max(Comparator.comparing(LocalDate::toEpochDay)).get();

        // Get Min Date
        LocalDate minDate = listOfLocalDates.stream()
                .min(Comparator.comparing(LocalDate::toEpochDay)).get();

        System.out.println("Logs cover the period from " + minDate + " to " + maxDate + ".");

    }
}
