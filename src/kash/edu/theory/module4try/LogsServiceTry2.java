package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  LogsServiceTry2
  @version  1.0.0 
  @since 12.04.2021 - 18.46
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LogsServiceTry2 {
    private final static String file = "C:/Users/Lenovo/Desktop/MY/Java/logs.txt";

    public LogsServiceTry2() {
    }

    public String getFile() {
        return file;
    }

    // Create a method that returns the total number of logs on a particular date
    // ---------------------- sequential approach (in a list) -----------------------------
    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString(); // convert data to string, for example: "2021-03-18"
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());
        return list;
    }
    // ----------------------  parallel approach (Multithreading) -----------------------------
    public static void getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String file = "C:/Users/Lenovo/Desktop/MY/Java/logs.txt";
        System.out.println(date + " - " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString)).count());
    }




        // Create a method that finds all the ERROR logs for a specific date
        // and writes them into a specific file (name = ERROR + Date  + .log)
        // Variant 1: using StringBuilder
        public static void logsByDateToFile(String file, LocalDate date) throws IOException {
            String dateAsString = date.toString(); // convert data to string, for example: "2021-03-18"
            String str = "";
            StringBuilder sb = new StringBuilder(str);

            Files.lines(Paths.get(file))
                    .filter(log -> log.contains(dateAsString))
                    .filter(log -> log.contains("ERROR"))
                    // .filter(log -> log.contains("2019"))
                    .forEach(log -> sb.append(log + '\n'));

            String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "ERROR " + dateAsString + ".log";
            Files.write(Paths.get(fileOutput), sb.toString().getBytes());
/*
        // Variant 2: Bad Way: String is an immutable object (Long)
        // insert logs (which are in list) in the file, to do this need to convert list --> to String
        for (String log: list){
            str += log + '\n';
        }
        1. 1 строка. 1: "";
        2. 2 строки. 1: "", 2: log1;
        3. 3 строки. 1: "", 2: log1, 3: log1 + log2;
        4. 4 строки. 1: "", 2: log1, 3: log1 + log2, 4: log1 + log2 + log3;
        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), str.getBytes());
*/
    }
}

