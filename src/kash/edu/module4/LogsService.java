package kash.edu.module4;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  LogsService
  @version  1.0.0 
  @since 15.04.2021 - 17.34
**/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

// ---------------------------- Sequential Approach --------------------------------

public class LogsService {

    public LogsService() {
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str);

        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + '\n'));

        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "ERROR "
                + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), sb.toString().getBytes());
    }

}
