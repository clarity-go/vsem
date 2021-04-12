package kash.edu.theory.module4try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  MeThreadTry
  @version  1.0.0 
  @since 12.04.2021 - 18.36
*/

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MyThreadTry extends Thread {

    private LocalDate date;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public MyThreadTry(LocalDate date) {
        this.date = date;
    }
/*
    // RightMouseClick - Generate - override methods - run()void
    @Override
    public void run() {
        System.out.println(this.getName());
        // delay for 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " has been started at" + start);
        try {
            LogsServiceTry2.getLogsCountByDate(this.getDate());
        } catch (IOException e){
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(this.getName() + " has been finished at" + finish);
        System.out.println(this.getName() + " DURATION is" + ChronoUnit.MILLIS.between(start, finish));
    }


}
