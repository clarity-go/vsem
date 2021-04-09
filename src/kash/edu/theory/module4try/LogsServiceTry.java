package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  mulithreadingTry
  @version  1.0.0 
  @since 09.04.2021 - 18.12
*/

// Mulithreading
/*
1. Use the file from the previous task  - logs.txt.
2. Create a class that manages logs in this file.
3. Create a method that finds all the ERROR logs  for a specific date
and write them into a specific file (name = ERROR  + Date  + .log)
4. In your main class develop a functionality to create 5 such a files
for 5 different days. Launch them in consistent way (one after another).
5. Repeat the above  task in parallel way. Multi-threading.
6. Compare the results.
*/

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

    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        // convert data to string
        String dateAsSring = date.toString(); // for example: 2021-03-18
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsSring))
                .collect(Collectors.toList());

        return list;
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {
        String dateAsSring = date.toString(); // for example: 2021-03-18
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsSring))
                .collect(Collectors.toList());

        // insert logs (which are in list) in the file, to do this need to convert list --> to String
        String str = "";
        for (String log: list){
            str += log + '\n';
        }

        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" +"ERROR" + dateAsSring + ".log";
        Files.write(Paths.get(fileOutput), str.getBytes(StandardCharsets.UTF_8));
    }
}
