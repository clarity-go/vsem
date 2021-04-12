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
//    private final static String file = "C:\Users\Lenovo\Desktop\MY\Java\logs.txt";

/*    public LogsServiceTry() {
    }

    public LogsServiceTry(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }*/

    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        // convert data to string
        String dateAsSring = date.toString(); // for example: 2021-03-18
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsSring))
                .collect(Collectors.toList());

        return list;
    }

    // Count the number of logs in a particular date
    public static int getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsSring = date.toString();
        String file = "C:/Users/Lenovo/Desktop/MY/Java/logs.txt";
        System.out.println(date + " - " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsSring)).count());
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {
        String dateAsSring = date.toString(); // for example: 2021-03-18
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsSring))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + '\n'));


        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "ERROR" + dateAsSring + ".log";
        Files.write(Paths.get(fileOutput), str.getBytes());
    }
}

