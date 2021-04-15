package kash.edu.module4;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  MyThread
  @version  1.0.0 
  @since 15.04.2021 - 17.35
**/
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// ---------------------- Parallel Approach (Multithreading) -----------------------

public class MyThread extends Thread {

    private LocalDate date;
    private String file;

    public MyThread() {
    }

    public MyThread(String file, LocalDate date) {
        this.file = file;
        this.date = date;
    }

    public String getFile() {
        return file;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " has been started at " + start);

        try {
            LogsService.logsByDateToFile(this.getFile(), this.getDate());
        } catch (IOException e){
            e.printStackTrace();
        }

        LocalDateTime finish = LocalDateTime.now();
        System.out.println(this.getName() + " has been finished at " + finish);
        System.out.println(this.getName() + " DURATION is "
                + ChronoUnit.MILLIS.between(start, finish) + " msec");
    }

}
