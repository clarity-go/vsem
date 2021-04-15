package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  mulithreadingTry
  @version  1.0.0 
  @since 09.04.2021 - 18.12
*/

// Multithreading
/*
1. Use the file from the previous task  - logs.txt.
2. Create a class that manages logs in this file.
3. Create a method that finds all the ERROR logs for a specific date
and writes them into a specific file (name = ERROR + Date  + .log)
4. In your main class develop a functionality to create 5 such a files
for 5 different days. Launch them in consistent way (one after another).
5. Repeat the above task in parallel way. Multi-threading.
6. Compare the results.
*/

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class LogsServiceTry {
    private String file;

    public LogsServiceTry() {
    }

    public LogsServiceTry(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    // Create a method that returns the total number of logs on a particular date (in a list)
    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString(); // convert data to string, for example: "2021-03-18"
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());
        return list;
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
